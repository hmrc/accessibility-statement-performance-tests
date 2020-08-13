package uk.gov.hmrc.perftests.example

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import uk.gov.hmrc.perftests.example.TrackingConsentFrontendRequests._

class TrackingConsentFrontendSimulation extends PerformanceTestRunner {

  setup("accessibility-statement", "Visit the accessibility statement page") withRequests navigateToAccessibilityStatement

  runSimulation()
}
