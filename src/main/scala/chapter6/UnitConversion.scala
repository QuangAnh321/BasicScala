package chapter6

class UnitConversion {

}

object InchesToCentimeters extends  UnitConversion {
  def inchesToCentimeters(inches: Double): Double =  inches / 39.37
}

object GallonsToLiters extends UnitConversion {
  def gallonsToLiters(gallons: Double): Double = gallons * 3.785
}

object MilesToKilometers extends UnitConversion {
  def milesToKilometers(miles: Double): Double = miles / 1.6
}
