import scala.io.Source
import scala.math.{pow, sqrt}

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    } yield in

    val data = lines.head.split(" ").toList.map(_.toDouble)
    println(sqrt(pow(data(2) - data(0), 2) + pow(data(3) - data(1), 2)))
  }
}
