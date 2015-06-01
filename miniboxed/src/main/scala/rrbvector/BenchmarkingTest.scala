package rrbvector

import scalameter._

object BenchmarkingTest extends ScalameterBenchTest
                           with MiniboxedBenchTest
                           with Serializable {

  // the number of independent samples to use
  lazy val sampleCount = 5
  
  override lazy val benchRunsPerSample = 1

  // the command used to start the JVM
  // HotSpot:
  lazy val javaCommand = "java -server"
  lazy val javaPreJDK7 = false

  // the test size
  lazy val testSizes = {
    List(5000000)
  }

  withTestSize(5000000){

    // run the tests:
    testMiniboxed()
  }
}
