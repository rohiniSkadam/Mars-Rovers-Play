package controllers

import models.Plateau
import play.api.mvc.{Action, Controller}

object Application extends Controller {


  import play.api.libs.json.Json

  def roverPositions = Action { request =>
    val jsonRequest = request.body.asJson.get
    val plateau = jsonRequest.as[Plateau]
    val rovList = PlateauController.roverPosition(plateau)
    Ok(Json.toJson(rovList))
  }
}