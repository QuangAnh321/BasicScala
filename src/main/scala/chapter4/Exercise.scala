package chapter4

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters._

object Exercise {

  def ex1() = {
    val pcParts = Map("RX570" -> 150, "i39100f" -> 90)
    val discounted = for ((k, v) <- pcParts) yield (k, v - v / 10)
    println(discounted)
  }
  def ex2() = {
    val wordCount = scala.collection.mutable.Map[String, Int]()
    val in = new java.util.Scanner(new java.io.File("myfile.txt"))
    while (in.hasNext()) {
      val nextWord = in.next()
      if (wordCount.contains(nextWord)) {
        wordCount(nextWord) = wordCount(nextWord) + 1
      } else {
        wordCount += (nextWord -> 1)
      }
    }
    println(wordCount)
  }

  def ex3(): Unit = {
    val in = new java.util.Scanner(new java.io.File("myfile.txt"))
    var wordList: scala.collection.mutable.ListBuffer[String] = ListBuffer()
    while (in.hasNext()) {
      wordList += in.next()
    }
    val distinctWordList = wordList.distinct
    val wordListMap = distinctWordList.map { word =>
      word -> wordList.count(_ == word)
    }.toMap
    println(wordListMap)
  }

  def ex4(): Unit = {
    val wordCount = scala.collection.mutable.SortedMap[String, Int]()
    val in = new java.util.Scanner(new java.io.File("myfile.txt"))
    while (in.hasNext()) {
      val nextWord = in.next()
      if (wordCount.contains(nextWord)) {
        wordCount(nextWord) = wordCount(nextWord) + 1
      } else {
        wordCount += (nextWord -> 1)
      }
    }
    println(wordCount)
  }

    // Ex8
    def minMaxSimple(values: Array[Int]): (Int, Int) = {
      (values.min, values.max)
    }

    def minMaxAdvanced(values: Array[Int]): (Int, Int) = {
      var min = Int.MaxValue
      for (value <- values) {
        if (value < min) min = value
      }

      var max = Int.MinValue
      for (value <- values) {
        if (value > max) max = value
      }
      (min, max)
    }

  def main(args: Array[String]): Unit = {
    val abc = Array(1, 2, 3)
    println(minMaxAdvanced(abc))
  }
}
