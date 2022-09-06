ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

//noinspection SpellCheckingInspection
lazy val root = (project in file("."))
  .settings(
    name := "final-reality-scala",
    idePackagePrefix := Some("cl.uchile.dcc.finalreality")
  )
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.19"
