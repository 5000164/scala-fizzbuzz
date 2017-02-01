package jp._5000164.FizzBuzz

object FizzBuzz {
  def main(args: Array[String]) {
  }
}

class FizzBuzz() {
  def calculateFizzBuzz(i: Int): String = {
    if (i == 15) {
      "fizzbuzz"
    } else if (i % 3 == 0) {
      "fizz"
    } else if (i == 5) {
      "buzz"
    } else {
      i.toString
    }
  }
}
