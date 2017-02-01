package jp._5000164.FizzBuzz.integration

import jp._5000164.FizzBuzz.FizzBuzz
import org.scalatest.FreeSpec

class FizzBuzzIntegration extends FreeSpec {

  trait Fixture {
    val fizzBuzz = new FizzBuzz
  }

  "FizzBuzz" - {
    "30 の Fizz Buzz が行える" in new Fixture {
      val expected: String =
        """1
          |2
          |fizz
          |4
          |buzz
          |fizz
          |7
          |8
          |fizz
          |buzz
          |11
          |fizz
          |13
          |14
          |fizzbuzz
          |16
          |17
          |fizz
          |19
          |buzz
          |fizz
          |22
          |23
          |fizz
          |buzz
          |26
          |fizz
          |28
          |29
          |fizzbuzz
          |""".stripMargin
      assert(expected == fizzBuzz.fizzBuzz(30))
    }
  }
}
