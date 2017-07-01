package inf

import models.Tables._

import play.api.libs.json._
import java.time._

import scala.concurrent.ExecutionContext.Implicits.global

object JsonSerialize {

//  implicit val postRowWrites = new Writes[PostsRow] {
//    def writes(posts: PostsRow) = Json.obj(
//      "id" -> posts.id,
//      "date" ->  posts.date.get.toString,
//      "title" -> posts.title
//    )
//  }
//
  implicit val entryRowWrites = new Writes[EntryRow] {
    def writes(entry: EntryRow) = Json.obj(
      "postId" -> entry.postId,
      "body" -> entry.body.get,
      "head" -> entry.head.get
    )
  }

//  implicit val pairWrites = new Writes[(PostsRow, EntryRow)] {
//    def writes(pair: (PostsRow, EntryRow)) =
//      Json.obj(
//      "post" -> Json.obj(
//        "id" -> pair._1.id,
//        "date" ->  pair._1.date.get.toString,
//        "title" -> pair._1.title,
//        "entries" -> Json.arr(
//          Json.obj(
//            "postId" -> pair._2.postId,
//            "body" -> pair._2.body.get,
//            "head" -> pair._2.head.get
//          )
//        )
//      )
//    )
//  }

  implicit val pairWrites = new Writes[(PostsRow, Seq[EntryRow])] {
    def writes(pair: (PostsRow, Seq[EntryRow])) =
      Json.obj(
        "post" -> Json.obj(
          "id" -> pair._1.id,
          "date" ->  pair._1.date.get.toString,
          "title" -> pair._1.title,
          "content" -> pair._2
        )
      )
  }

}
