import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <- Source.stdin.getLines.toList
      } yield in.map(_.toLower)

      println(if((line(0) + line(0)).contains(line(1))) "Yes" else "No")
  }
}
