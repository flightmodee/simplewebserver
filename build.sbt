val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "SimpleWebServer",
    version := "0.1.0-SNAPSHOT",
    developers := List(
      Developer(
        id    = "flightmodee",
        name  = "Samy Abdouche",
        email = "samy.abdouche@edu.esiee.com",
        url   = url("https://github.com/flightmodee")
      )
        Developer(
        id    = "MelineDang",
        name  = "Méline Dang",
        email = "meline.dang@edu.esiee.fr",
        url   = url("https://github.com/MelineDang")
      )
        Developer(
        id    = "cai-i",
        name  = "Isabelle Cai",
        email = "isabelle.cai@edu.esiee.fr",
        url   = url("https://github.com/cai-i")
      )
        Developer(
        id = "axelcoch",
        name = "Axel Cochet",
        email = "axel.cochet@edu.esiee.fr",
        url = url("https://github.com/axelcoch")
      )
    ),
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq("org.scalameta" %% "munit" % "0.7.29" % Test)
  )
