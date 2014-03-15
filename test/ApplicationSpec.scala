
import org.scalatest._
import org.scalatestplus.play._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class ApplicationSpec extends PlaySpec with OneAppPerTest with OptionValues {

  "Application" should {

    "send 404 on a bad request" in {
      route(FakeRequest(GET, "/boum")) mustBe None
    }

    "render the index page" in {
      val home = route(FakeRequest(GET, "/")).get

      status(home) mustEqual OK
      contentType(home).value mustBe "text/html"
      contentAsString(home) must include ("Your new application is ready.")
    }
  }
}
