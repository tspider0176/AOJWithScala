import scala.io.Source
import scala.math._

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    } yield in

    val data =  lines.head.split(" ").toList.map(_.toInt)
    println(data(0) * data(1) * sin(data(2) * Pi / 180) / 2)
    println(data(0) + data(1) + sqrt(pow(data(0), 2) + pow(data(1), 2) - 2 * data(0) * data(1) * cos(data(2) * Pi /180)))
    println(data(1) * sin(data(2) * Pi / 180))
  }
}
