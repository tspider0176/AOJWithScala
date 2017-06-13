import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <-Source.stdin.getLines.toList
      } yield in.map(_.toLower)

    println(line.tail.mkString(" ").split(" ").filter(_ == line(0)).length)
  }
}
