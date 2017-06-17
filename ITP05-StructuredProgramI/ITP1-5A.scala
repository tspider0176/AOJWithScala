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

      (1 to height).foreach{ i =>
        print("#" * width)
        println
      }
      println
    }
  }
}
