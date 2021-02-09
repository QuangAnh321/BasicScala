package chapter5

object Exercise {
  def main(args: Array[String]): Unit = {
//    val abc = new Time(8, 15)
//    val xyz = new Time(8, 16)
//    println(abc.before(xyz))
//
//    val abc2 = new TimeAdvanced(4, 15)
//    val john = new Person(-1)
//    println(john.age)

    val johnSmith = new Person4("John Smith")
  }
}

class BankAccount {
  val balance: Double = 0

  def deposit(amount: Double) = {
      val newBalance = balance + amount
      newBalance
  }

  def withdraw(amount: Double) = {
    val newBalance = balance - amount
    newBalance
  }
}

class Time(val hours: Int,
           val minutes: Int) {

  if (hours < 0 || hours > 23 || minutes < 0 || minutes > 60) {
    throw new Exception("Invalid hours or minutes")
  }

  def before(other: Time): Boolean = {
    if (other.hours > this.hours) {
      true
    } else if (other.hours == this.hours) {
      if (other.minutes > this.minutes) {
        true
      } else {
        false
      }
    } else {
      false
    }
  }
}

class TimeAdvanced(val hours: Int,
                   val minutes: Int) {

  if (hours < 0 || hours > 23 || minutes < 0 || minutes > 60) {
    throw new Exception("Invalid hours or minutes")
  }

  private val minutesSinceMidNight = hours * 60 + minutes
  println(s"${this} minutesSinceMidnight: ${this.minutesSinceMidNight}")

  def before(other: TimeAdvanced): Boolean = {
    if (other.minutesSinceMidNight > this.minutesSinceMidNight) {
      true
    } else {
      false
    }
  }
}

class Person4(fullName: String) {
  private val firstName = fullName.split(" ").head
  private val lastName = fullName.split(" ").last

  println(s"FirstName: ${firstName}")
  println(s"LastName: ${lastName}")
}
