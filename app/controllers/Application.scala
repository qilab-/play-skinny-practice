package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    println(models.User.findAll())
    // Ok(views.html.index("Your new application is ready."))
    Ok
  }

}
