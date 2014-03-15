name := "scalatestplus-play-sample-app"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.scalatestplus" %% "play" % "0.8.0-SNAP1" % "test",
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

resolvers += Resolver.sonatypeRepo("releases")

