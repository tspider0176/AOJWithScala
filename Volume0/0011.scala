import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val horizontal = StdIn.readLine
    StdIn.readLine
    val lines = Iterator.continually(StdIn.readLine).takeWhile(_ != null).toList.map(_.split(",").toList.map(_.toInt))

    println(horizontal + " " + lines)
  }
}
