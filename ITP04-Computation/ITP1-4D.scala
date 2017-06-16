import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val list = StdIn.readLine.split(" ").map(_.toLong).toList

    println(list.min + " " + list.max + " " + list.sum)
  }
}
