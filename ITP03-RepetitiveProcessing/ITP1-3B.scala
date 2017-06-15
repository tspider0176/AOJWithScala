import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <- Source.stdin.getLines.toList
      } yield in

    line.init.zipWithIndex.foreach{case (elem, index) => println(s"Case ${index+1}: ${elem}")}
  }
}
