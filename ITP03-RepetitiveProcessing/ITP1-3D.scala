import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val line = StdIn.readLine.split(" ").toList.map(_.toInt)

    println((line.head to line.tail.head).map{i => line.last % i == 0}.filter{_ == true}.length)
  }
}
