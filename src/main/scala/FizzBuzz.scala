object FizzBuzz {
  def main(args: Array[String]) {
  }
}

class FizzBuzz() {
  def fizzBuzz(i: Int): String = {
    if (i == 3) {
      "fizz"
    } else if (i == 5) {
      "buzz"
    } else if (i == 15) {
      "fizzbuzz"
    } else {
      i.toString
    }
  }
}
