import scala.io.Source
import scala.math._

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    }yield in

    val num = lines.length / 2

    for(i <- 0 until num){
      println(stdDeviation(lines(i * 2 + 1).split(" ").toList.map(_.toDouble)))
    }
  }

  def stdDeviation(list: List[Double]): Double={
   sqrt(list.map{_ - (list.sum / list.length)}.map{pow(_, 2)}.sum / list.length)
  }
}
