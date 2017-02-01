package jp._5000164.FizzBuzz.unit

import jp._5000164.FizzBuzz.FizzBuzz
import org.scalatest.FreeSpec

class FizzBuzzSpec extends FreeSpec {

  trait Fixture {
    val fizzBuzz = new FizzBuzz
  }

  "FizzBuzz" - {
    "calculateFizzBuzz" - {
      "1 を渡したら 1 が返される" in new Fixture {
        assert("1" == fizzBuzz.calculateFizzBuzz(1))
      }

      "3 を渡したら fizz が返される" in new Fixture {
        assert("fizz" == fizzBuzz.calculateFizzBuzz(3))
      }

      "5 を渡したら buzz が返される" in new Fixture {
        assert("buzz" == fizzBuzz.calculateFizzBuzz(5))
      }

      "15 を渡したら fizzbuzz が返される" in new Fixture {
        assert("fizzbuzz" == fizzBuzz.calculateFizzBuzz(15))
      }

      "6 を渡したら fizz が返される" in new Fixture {
        assert("fizz" == fizzBuzz.calculateFizzBuzz(6))
      }
    }
  }
}
