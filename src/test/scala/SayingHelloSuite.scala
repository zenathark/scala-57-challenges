import SayingHello.sayHello
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SayingHelloSuite extends AnyFlatSpec with should.Matchers:

  "sayHello" should "return hello with name included" in {
    val name = "Juan"
    sayHello(name) should include(name)
  }

