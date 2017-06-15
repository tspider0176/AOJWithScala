import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <- Source.stdin.getLines.toList
      } yield in

    println(line.map{str => str.split(" ").map(_.toInt).sorted.mkString(" ")}.init.mkString("\n"))
  }
}
