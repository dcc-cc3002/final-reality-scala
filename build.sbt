ThisBuild / version := "1.0-RELEASE"

ThisBuild / scalaVersion := "2.13.8"

//noinspection SpellCheckingInspection
lazy val root = (project in file("."))
  .settings(
    name := "final-reality-scala",
    idePackagePrefix := Some("cl.uchile.dcc.finalreality")
  )
libraryDependencies += "com.beautiful-scala" %% "scalastyle" % "1.5.1"