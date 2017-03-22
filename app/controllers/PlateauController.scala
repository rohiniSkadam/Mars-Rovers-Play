package controllers

import models.{Plateau, Rover}

/**
  * Created by synerzip on 21/2/17.
  */
object PlateauController {

  /**
    * Function to find the rover position & to fire the commands
    *
    * @param plateau - Object of Plateau to get the rover list
    */
  def roverPosition(plateau: Plateau): List[Rover] = {
    val rovList: List[Rover] = plateau.rover
    val newList = rovList.map(r => {
      RoverController.fireCommand(r)
    })
    newList
  }
}
