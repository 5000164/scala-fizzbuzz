package jp._5000164.FizzBuzz

object FizzBuzz {
  def main(args: Array[String]) {
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
    if (i % 15 == 0) {
      "fizzbuzz"
    } else if (i % 3 == 0) {
      "fizz"
    } else if (i % 5 == 0) {
      "buzz"
    } else {
      i.toString
    }
  }
}
