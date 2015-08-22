import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines =
      for{
      in <- Source.stdin.getLines.toList
    }yield in.toString

    val point1 =
      lines.tail.map(_.toString.split(" ").toList).map{
        case x if(x(0).compare(x(1)) == 0) => 1
        case x if(x(0).compare(x(1)) > 0 ) => 3
        case _ => 0
      }.sum

    val point2 =
      lines.tail.map(_.toString.split(" ").toList).map{
        case x if(x(0).compare(x(1)) < 0 ) => 3
        case x if(x(0).compare(x(1)) == 0) => 1
        case _ => 0
      }.sum

    println(point1 + " " + point2)
  }
}
