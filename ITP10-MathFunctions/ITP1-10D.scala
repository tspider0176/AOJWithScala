import scala.io.Source
import scala.math._

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    }yield in.toString.split(" ").toList.map(_.toInt)

    println(dimDis(lines(1), lines(2), 1).sum)
    println(sqrt(dimDis(lines(1), lines(2), 2).sum))
    println(pow(dimDis(lines(1), lines(2), 3).sum, (1.0/3.0)))
    println(dimDis(lines(1), lines(2), 1).max)
  }

  def dimDis(from: List[Int], to: List[Int], n: Int): List[Double] ={
    if(from == Nil) List()
    else if(to == Nil) List()
    else pow(abs(from.head - to.head), n) :: dimDis(from.tail, to.tail, n)
  }
}
