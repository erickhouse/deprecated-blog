name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

unmanagedResourceDirectories in Assets += baseDirectory.value / "client/build/"

//unmanagedResourceDirectories in Compile += baseDirectory.value / "client/build/"

//lazy val npmBuildTask = taskKey[Unit]("Execute the npm build command to build the ui")
//
//npmBuildTask := {
//  "cd public/ && npm install" !
//}

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
libraryDependencies += "org.postgresql" % "postgresql" % "9.4-1206-jdbc42"


libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "com.typesafe.slick" %% "slick-codegen" % "3.0.3",
  "com.zaxxer" % "HikariCP" % "2.4.1"
)

//slick <<= slickCodeGenTask // register manual sbt command
//sourceGenerators in Compile <+= slickCodeGenTask
//
//lazy val slick = TaskKey[Seq[File]]("gen-tables")
//lazy val slickCodeGenTask = (sourceManaged, dependencyClasspath in Compile, runner in Compile, streams) map { (dir, cp, r, s) =>
//  val outputDir = (dir / "slick").getPath // place generated files in sbt's managed sources folder
//  val url = "jdbc:postgresql://127.0.0.1:5432/postgres"// connection info for a pre-populated throw-away, in-memory db for this demo, which is freshly initialized on every run
//  val jdbcDriver = "org.postgresql.Driver"
//  val slickDriver = "slick.driver.PostgresDriver"
//  val pkg = "models"
//  val user = "postgres"
//  val password = "h2rronbw"
//  toError(r.run("slick.codegen.SourceCodeGenerator", cp.files, Array(slickDriver, jdbcDriver, url, outputDir, pkg, user, password), s.log))
//  val fname = outputDir + "/models/Tables.scala"
//  Seq(file(fname))
//}

//libraryDependencies += "com.typesafe.play" %% "play-slick" % "2.0.0"
