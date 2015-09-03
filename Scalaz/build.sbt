name := """Scalaz"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scalaz" %% "scalaz-core" % "7.1.3"
)
// 企業名 %% ライブラリ自体のver % 最新版 % 単体テストをしたい時につけるもの
// 「mavan 書き方」
// 「mavan tool」 -> the central repository
// simple build tool -> sbt

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"
