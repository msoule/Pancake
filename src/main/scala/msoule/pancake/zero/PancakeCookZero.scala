package msoule.pancake.zero

import msoule.pancake.model.{Burnt, GoldenDeliciousness, Pancake, Plate}

class PancakeCookZero {

  def servePancakes(plate: Plate[Pancake]): Plate[Pancake] = {
    val freshPlates = putPancakesOnOwnPlate(plate)
    sortOntoOnePlate(freshPlates)
  }

  private def putPancakesOnOwnPlate(plate: Plate[Pancake]): Seq[Plate[Pancake]] = {
    val indexedPancakes = plate.contents.toIndexedSeq
    var n = 0
    var freshPlates: Seq[Plate[Pancake]] = Nil
    for(n <- plate.contents.indices) {
      freshPlates = Plate[Pancake](Seq(indexedPancakes(n))) +: freshPlates
    }
    freshPlates
  }

  private def sortOntoOnePlate(plates: Seq[Plate[Pancake]]) = {
    var trackedPlates = plates
    var plateToServe = new Plate[Pancake](Nil)

    plates.indices.foreach { _ =>
      val plateWithLargest = findPositionOfLargestCake(trackedPlates)
      plateToServe = plateToServe.copy(trackedPlates.toIndexedSeq(plateWithLargest).contents.head +: plateToServe.contents)
      trackedPlates = trackedPlates.slice(0, plateWithLargest) ++ trackedPlates.slice(plateWithLargest + 1, trackedPlates.size)
    }
    plateToServe
  }

  private def findPositionOfLargestCake(plates: Seq[Plate[Pancake]]): Integer = {
    val largestCake = plates.max(PancakeCookZero.Ordering)
    plates.indexOf(largestCake)
  }

}

object PancakeCookZero {
  class PancakePlateOrdering extends Ordering[Plate[Pancake]] {
    override def compare(p1: Plate[Pancake], p2: Plate[Pancake]): Int = {
      p1.contents.head.size - p2.contents.head.size
    }
  }

  val Ordering = new PancakePlateOrdering
}
