import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val lines = Iterator.continually(StdIn.readLine).takeWhile(_ != null).toList
    lines.tail.map((x:String) => x.sorted.reverse.toInt - x.sorted.toInt).foreach(println)
  }
}
