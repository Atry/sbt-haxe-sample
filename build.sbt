name := "sbt-haxe-sample"

version := "1.0"

scalaVersion := "2.11.7"

haxeOptions in Js ++= Seq("-dce", "no")