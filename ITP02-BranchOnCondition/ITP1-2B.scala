import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <- Source.stdin.getLines.toList
      } yield in.split(" ").map(_.toInt).toList

    boc(line.flatten)
  }

  def boc(a: List[Int])={
    if(a.sorted == a && a.distinct == a) println("Yes")
    else println("No")
  }
}
