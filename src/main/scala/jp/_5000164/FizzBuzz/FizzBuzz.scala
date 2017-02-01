package jp._5000164.FizzBuzz

object FizzBuzz {
  def main(args: Array[String]): Unit = {
    val fizzBuzz = new FizzBuzz
    print(fizzBuzz.fizzBuzz(30))
  }
}

class FizzBuzz() {
  def fizzBuzz(limit: Int): String = {
    var fizzBuzz = ""
    for (i <- 1 to limit) {
      fizzBuzz += this.calculateFizzBuzz(i) + "\n"
    }

    fizzBuzz
  }


  def calculateFizzBuzz(i: Int): String = {
    i match {
      case j if j % 15 == 0 => "fizzbuzz"
      case j if j % 3 == 0 => "fizz"
      case j if j % 5 == 0 => "buzz"
      case j => j.toString
    }
  }
}
