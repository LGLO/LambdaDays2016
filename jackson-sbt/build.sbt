name := "jackson-sbt"

version := "1.0"

scalaVersion in Global := "2.11.7"

lazy val `jackson-wrapper` = project
lazy val core = project dependsOn `jackson-wrapper`

