package msoule.pancake.hero

import msoule.pancake.model.{Burnt, GoldenDeliciousness, Pancake, Plate}

import scala.collection.Searching

class PancakeCookHero {

  def servePancakes(plate: Plate[Pancake]): Plate[Pancake] = {
    plate.contents
      .map(putPancakeOnOwnPlate)
      .reduce(pancakesToOnePlate)
  }

  private def putPancakeOnOwnPlate(pancake: Pancake) = {
    Plate(Seq(pancake))
  }

  private def pancakesToOnePlate(plateToServe: Plate[Pancake], nextPlate: Plate[Pancake]): Plate[Pancake] = {
    nextPlate.contents
      .headOption
      .map(moveCakeOntoPlate(plateToServe))
      // skip empty plates
      .getOrElse(plateToServe)

  }

  private def moveCakeOntoPlate(plate: Plate[Pancake])(pancake: Pancake) = {
    val placeInStack = Searching.search(plate.contents).search(pancake)(Pancake.PancakeOrdering)
    Plate(
      plate.contents.slice(0, placeInStack.insertionPoint) ++
        Seq(pancake) ++
        plate.contents.slice(placeInStack.insertionPoint, plate.contents.size))
  }



}


