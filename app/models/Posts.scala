package models

import models.Tables._
import play.api.libs.json.Writes
import play.api.libs.json._
import slick.driver.PostgresDriver.api._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration


import scala.concurrent.ExecutionContext.Implicits.global


case class User(id: Int, lastName: String, firstName: String, address:String, city:String)


class UserTableDef(tag: Tag) extends Table[User](tag, "users") {

  def id = column[Int]("personid")
  def firstName = column[String]("lastname")
  def lastName = column[String]("firstname")
  def address = column[String]("address")
  def city = column[String]("city")

  override def * =
    (id, firstName, lastName, address, city) <> (User.tupled, User.unapply)
}


object PostEntry {

  val db = Database.forConfig("postgres")

  def getAll(): Future[Map[PostsRow, Seq[EntryRow]]] = {

    val posts = TableQuery[Tables.Posts]
    val entry = TableQuery[Tables.Entry]

//    val innerJoin = for {
//      (p, e) <- posts join entry on (_.id === _.postId)
//    } yield (p,e)
//
//    val group = innerJoin.groupBy(_._1)

    val res =  posts join entry on (_.id === _.postId)

     val result = db.run(res.result)
    //result.map(s => s.toMap.groupBy(_._1))
    for(i <- result) yield i.groupBy(x => x._1).map(x => (x._1, x._2.map(x => x._2)))
  }

}
