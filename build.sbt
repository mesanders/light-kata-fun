name := "light-kata-fun"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalanlp" %% "breeze" % "1.0-RC2",
  "com.stripe" %% "rainier-core" % "0.1.1",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
)


resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"