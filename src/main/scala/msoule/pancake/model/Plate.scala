package msoule.pancake.model

/**
  * Plate on which food is stacked.
  *
  * Assumptions:
  *   Food must be stacked and can not sit next to each other.
  *   Only one type of food item can occupy a plate (besides condiments). We are a very simple
  *   restaurant.
  *
  * @param contents A stack of FoodItems.
  * @tparam FoodItem The type of food item.
  */
case class Plate[FoodItem](contents: Seq[FoodItem])
