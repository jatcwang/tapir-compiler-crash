val thisScalaVersion = "2.12.8"

val root = Project("root", file("."))
  .settings(
    name := "Empty Project",
    organization := "com.example",
    version := "0.1.0",
    scalaVersion := thisScalaVersion,
    /* crossScalaVersions := Seq("2.11.11", thisScalaVersion), */
    scalacOptions ++= Seq("-language:higherKinds", "-Ypartial-unification"),

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "1.6.0",

      "org.scalatest" %% "scalatest" % "3.0.7" % "test",
    ) ++ Seq(
    "com.softwaremill.tapir" %% "tapir-core" % "0.8.3",
    "com.softwaremill.tapir" %% "tapir-json-circe" % "0.8.3",
    "com.softwaremill.tapir" %% "tapir-openapi-docs" % "0.8.3",
    "com.softwaremill.tapir" %% "tapir-openapi-circe-yaml" % "0.8.3",
    "com.softwaremill.tapir" %% "tapir-akka-http-server" % "0.8.3",
  )
  )
