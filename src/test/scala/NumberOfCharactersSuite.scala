import NumberOfCharacters.count
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class NumberOfCharactersSuite extends AnyFlatSpec with should.Matchers:

  "numberOfCharacters" should "return the 4 when input Juan" in {
    val string = "Juan"
    val expected = 4
    count(string) should be(expected)
  }

