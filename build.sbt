import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.dneveu",
      scalaVersion := "2.12.4",
      version      := "0.1.0"
    )),
    name := "s-99",
    libraryDependencies += scalaTest % Test
  )
