package uk.gov.hmrc.perftests.example

import uk.gov.hmrc.performance.conf.ServicesConfiguration

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object AccessibilityStatementFrontendRequests extends ServicesConfiguration {

  val baseUrl = baseUrlFor("accessibility-statement-frontend")

  val navigateToAccessibilityStatement = {
    http("Navigate to accessibility statement")
      .get(s"$baseUrl/accessibility-statement/$${serviceName}")
      .check(status.is(200))
  }
}
