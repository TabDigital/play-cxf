name := "play-cxf-client"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies += "eu.imind.play" %% "play-cxf_play25" % "1.2.2-SNAPSHOT"

libraryDependencies += "org.apache.cxf" % "cxf-rt-bindings-soap" % "3.1.2"

libraryDependencies += "org.apache.cxf" % "cxf-rt-frontend-jaxws" % "3.1.2"

libraryDependencies += "org.apache.cxf" % "cxf-rt-transports-http" % "3.1.2"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
