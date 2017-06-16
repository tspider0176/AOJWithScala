import scala.io.Source

object Main{
  def main(args: Array[String]){
    val list =
      for{
        in <- Source.stdin.getLines.toList
      } yield in.split(" ").map(_.toInt)

    boc(list.flatten)
  }

  def boc(a: List[Int])={
    if(a.head == a.last) println("a == b")
    else if(a.head - a.last > 0) println("a > b")
    else if(a.head - a.last < 0) println("a < b")
    else println()
  }
}
