import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <-Source.stdin.getLines.toList
      } yield in.map(c => c.toLower)

    println(line.tail.mkString(" ").split(" ").filter(_ == line(0)).length)
  }
}
