name := """play-scala-starter-example"""

version := "1.0.0"

lazy val root= (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )




/* Slick Dependencies */

libraryDependencies ++= {

  val slickVersion = "3.3.1"
  Seq (
    "com.typesafe.slick" %% "slick" % slickVersion,
    "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
    "org.slf4j" % "slf4j-nop" % "1.7.26"
  )
}
play.sbt.PlayImport.PlayKeys.playDefaultPort := 3032


libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0"

/* Jackson dependencies */
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.5.3"
libraryDependencies += "org.json4s" %% "json4s-core" % "3.5.3"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.11.2"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.11.2"
