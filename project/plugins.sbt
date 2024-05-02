resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(
  Resolver.ivyStylePatterns
)

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "3.9.0")

addSbtPlugin("uk.gov.hmrc" % "performance-test-plugin" % "0.1.0-SNAPSHOT")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
