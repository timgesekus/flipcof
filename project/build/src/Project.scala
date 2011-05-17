import sbt._
import de.element34.sbteclipsify._

class Project(info: ProjectInfo) extends DefaultProject(info) with Eclipsify {
 val snapshots = "snapshots" at "http://scala-tools.org/repo-snapshots"
 val releases  = "releases" at "http://scala-tools.org/repo-releases"

 val specs2 = "org.specs2" %% "specs2" % "1.3"  
 val scalaz = "org.specs2" %% "scalaz-core" % "6.0.RC2"  
 val scalatest = "org.scalatest" %% "scalatest" % "1.4.1"
   
 def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
 override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)

}
