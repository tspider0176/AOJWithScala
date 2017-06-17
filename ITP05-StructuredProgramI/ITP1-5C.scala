import scala.io.Source

object Main{
  def main(args: Array[String]){
    val list =
      for{
        in <- Source.stdin.getLines.toList
      } yield in

    list.map(_.split(" ").map(_.toInt).toList).init.foreach{ list =>
      val height = list.head
      val width = list.last
      val bw = "#."

      (1 to height).foreach{ row =>
        row match{
          case x if x % 2 == 0 => println((bw.reverse * width).take(width))
          case x if x % 2 == 1 => println((bw * width).take(width))
        }
      }
      println
    }
  }
}
