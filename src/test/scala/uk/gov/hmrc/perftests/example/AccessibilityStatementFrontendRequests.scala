/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.perftests.example

import uk.gov.hmrc.performance.conf.ServicesConfiguration
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object AccessibilityStatementFrontendRequests extends ServicesConfiguration {

  private val baseUrl = baseUrlFor("accessibility-statement-frontend")

  val navigateToAccessibilityStatement: HttpRequestBuilder =
    http("Navigate to accessibility statement")
      .get(s"$baseUrl/accessibility-statement/$${serviceName}")
      .resources(
        http("font-bold")
          .get(s"$baseUrl/accessibility-statement/hmrc-frontend/assets/govuk/fonts/bold-b542beb274-v2.woff2"),
        http("css").get(s"$baseUrl/accessibility-statement/hmrc-frontend/assets/all-govuk-and-hmrc.scss"),
        http("js").get(s"$baseUrl/accessibility-statement/hmrc-frontend/assets/all.js"),
        http("favicon").get(s"$baseUrl/accessibility-statement/hmrc-frontend/assets/govuk/images/favicon.ico"),
        http("govuk-crest")
          .get(s"$baseUrl/accessibility-statement/hmrc-frontend/assets/govuk/images/govuk-crest-2x.png"),
        http("font-light")
          .get(s"$baseUrl/accessibility-statement/hmrc-frontend/assets/govuk/fonts/light-94a07e06a1-v2.woff2")
      )
      .check(status.is(200))
}
