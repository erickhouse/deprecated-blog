package controllers

import javax.inject._
import play.api.mvc._
import javax.inject.Inject
import inf.JsonSerialize._
import play.api.libs.json._
import models._
import scala.concurrent.ExecutionContext.Implicits.global


@Singleton
class AppController @Inject() extends Controller {

  def index = Action.async{

    PostEntry.getAll().map {
      result => Ok(Json.prettyPrint(Json.toJson(result)))
    }

  }

  def posts() = Action.async{

    PostEntry.getAll().map {
      result => Ok(Json.prettyPrint(Json.toJson(result)))
    }

  }

  def test(badRoutes : String) = Action {
        Ok(views.html.index())
  }

}
