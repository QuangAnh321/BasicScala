package chapter4

object Example extends App {

  val pcPart = Map(1 -> "CPU", 2 -> "GPU")

  val pcPartMutable = scala.collection.mutable.Map(1 -> "CPU", 2 -> "GPU")

  val getCPU = pcPart(1)

  pcPartMutable += (3 -> "Motherboard", 4 -> "Ram")

  //pcPartMutable -= "CPU"

  val additionalPcPart = pcPart + (3 -> "Motherboard", 4 -> "Ram")

    for ((k, v) <- additionalPcPart) {
      println(s"Key: ${k}")
      println(s"Value: ${v}")
      println("")
    }
}
