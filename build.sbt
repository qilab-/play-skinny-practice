name := """play-skinny-practice"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "[5.1,)",
  "com.h2database" % "h2" % "1.4.+",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.skinny-framework" %% "skinny-orm" % "1.3.14",
  "org.scalikejdbc" %% "scalikejdbc-test" % "2.2.+" % "test"
)
