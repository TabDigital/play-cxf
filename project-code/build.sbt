import play.core._
import sbt.Keys._


val playVersionSuffix: String = {
  val versions = PlayVersion.current.split('.')
  require(versions.length >= 2)
  s"${versions(0)}${versions(1)}"
}

name := s"play-cxf_play$playVersionSuffix"

organization := "eu.imind.play"

organizationName := "iMind"

organizationHomepage := Some(url("http://imind.eu/"))

version := "1.2.2-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.cxf" % "cxf-core" % "3.1.2"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("http://www.imind.eu/web/2013/11/07/developing-soap-services-using-play-framework-2-2-x/"))

scmInfo := Some(ScmInfo(
  url("https://github.com/imindeu/play-cxf"),
  "scm:git:https://github.com/imindeu/play-cxf.git",
  Some("scm:git:git@github.com:imindeu/play-cxf.git")))

pomExtra :=
  <developers>
    <developer>
      <id>kustra</id>
      <name>László Zsolt Kustra</name>
      <email>laszlo.kustra@gmail.com</email>
      <url>http://laszlo.kustra.hu/</url>
      <organization>iMind</organization>
      <organizationUrl>http://imind.eu/</organizationUrl>
    </developer>
  </developers>

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

lazy val root = (project in file(".")).enablePlugins(PlayScala)
