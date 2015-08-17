name := "sbt-haxe-sample"

version := "1.0"

scalaVersion := "2.11.7"

enablePlugins(HaxeJsPlugin)
enablePlugins(HaxePhpPlugin)
enablePlugins(HaxeNekoPlugin)
enablePlugins(HaxeCSharpPlugin)
enablePlugins(HaxePythonPlugin)
enablePlugins(HaxeCppPlugin)

for (c <- Seq(Compile, Test)) yield {
  haxeOptions in c ++= Seq("-dce", "no")
}

//haxeOptions in Js ++= Seq("-dce", "no")

