logLevel := Level.Warn

lazy val plugins = project in file(".") dependsOn `sbt-haxe`

lazy val `sbt-haxe` = project