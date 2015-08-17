name := "sbt-haxe-sample"

version := "1.0"

scalaVersion := "2.11.7"

enablePlugins(HaxeJsPlugin)
enablePlugins(HaxePhpPlugin)
enablePlugins(HaxeNekoPlugin)
enablePlugins(HaxeCSharpPlugin)
enablePlugins(HaxePythonPlugin)
enablePlugins(HaxeCppPlugin)
enablePlugins(HaxeFlashPlugin)
enablePlugins(HaxeAs3Plugin)

for (c <- Seq(Compile, Test)) yield {
  haxeOptions in c ++= Seq("-dce", "no")
}

haxeOptions in Flash ++= Seq("-swf-header", "960:640:60:f68712", "-swf-version", "15")