import org.scalatest.FreeSpec

class FizzBuzzSpec extends FreeSpec {

  trait Fixture {
    val fizzBuzz = new FizzBuzz
  }

  "FizzBuzz" - {
    "fizzBuzz" - {
      "1 を渡したら 1 が返される" in new Fixture {
        assert("1" == fizzBuzz.fizzBuzz(1))
      }

      "3 を渡したら fizz が返される" in new Fixture {
        assert("fizz" == fizzBuzz.fizzBuzz(3))
      }

      "5 を渡したら buzz が返される" in new Fixture {
        assert("buzz" == fizzBuzz.fizzBuzz(5))
      }
    }
  }
}
