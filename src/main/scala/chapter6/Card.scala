package chapter6

object Card extends Enumeration {
  val Heart = Value("Heart")
  val Spade = Value("Spade")
  val Diamond = Value("Diamond")
  val Club = Value("Club")

//  override def toString(): String = getClass match {
//    case Club => "anc"
//    case _ => "fdfdfdfdf"
//  }

  def getBlabla = getClass

  def main(args: Array[String]): Unit = {
    println(getBlabla)
  }
}
