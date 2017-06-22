package msoule.pancake

import msoule.pancake.hero.PancakeCookHero
import msoule.pancake.model.{Burnt, GoldenDeliciousness, Pancake, Plate}
import msoule.pancake.zero.PancakeCookZero

import scala.util.Random

object PancakeMain extends App {
  val zero = new PancakeCookZero
  val hero = new PancakeCookHero

  val stackSize = Random.nextInt(6) + 3
  val pancakes = Seq.fill(stackSize) { Pancake(Random.nextInt(100), if(Random.nextBoolean()) GoldenDeliciousness else Burnt) }
  val plate = Plate(pancakes)

  val zeroResult = zero.servePancakes(plate)
  val heroResult = hero.servePancakes(plate)

  println(s"zero: $zeroResult")
  println(s"hero: $heroResult")
}
