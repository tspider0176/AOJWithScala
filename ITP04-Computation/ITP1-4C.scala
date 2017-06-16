import scala.io.Source

object Main{
  def main(args: Array[String]){
    val list =
      for{
        in <- Source.stdin.getLines.toList
      } yield in

    list.map(_.split(" ").toList).filter{_.length > 2}.map{list =>
      val l = list.head.toInt
      val r = list.last.toInt

      list.tail.head match {
        case "+" => println(l + r)
        case "-" => println(l - r)
        case "*" => println(l * r)
        case "/" => println(l / r)
        case "?" =>
      }
    }
  }
}
