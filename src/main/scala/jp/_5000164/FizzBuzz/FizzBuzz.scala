package jp._5000164.FizzBuzz

object FizzBuzz {
  def main(args: Array[String]): Unit = {
    val fizzBuzz = new FizzBuzz
    print(fizzBuzz.fizzBuzz(30))
  }
}

class FizzBuzz() {
  def fizzBuzz(limit: Int): String = {
    require(limit > 1)

    (1 to limit).toList.map(this.calculateFizzBuzz).mkString("", "\n", "\n")
  }

  def calculateFizzBuzz(i: Int): String = {
    def f(j: Int, s: String) = { (k: Int) => if (k % j == 0) s else "" }

    val fizz = f(3, "fizz")
    val buzz = f(5, "buzz")
    val fizzbuzz = fizz(i) + buzz(i)

    if (fizzbuzz != "") fizzbuzz else i.toString
  }
}
