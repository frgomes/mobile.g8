enablePlugins(SriPlatformPlugin)

name := "$name$"

scalaVersion := "2.12.8"
crossScalaVersions := ("2.12.8", 2.13.0")

lazy val versions = new {
  val sri = "2019.06.26"
}


resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
resolvers += Resolver.bintrayRepo("scalajs-plus", "maven")

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core"                    % versions.sri,
  "scalajs-react-interface" %%% "mobile"                  % versions.sri,
  "scalajs-react-interface" %%% "universal"               % versions.sri,
  "scalajs-react-interface" %%% "vector-icons"            % versions.sri,
  "scalajs-react-interface" %%% "platform-config-ios"     % versions.sri % IOS,
  "scalajs-react-interface" %%% "platform-config-android" % versions.sri % Android,
  "scalajs-react-interface" %%% "navigation"              % versions.sri
)


scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)
