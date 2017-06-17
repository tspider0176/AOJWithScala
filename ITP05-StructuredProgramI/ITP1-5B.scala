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

      println("#" * width)
      (2 to height-1).foreach{ i =>
        println(s"#${"." * (width - 2)}#")
      }
      println("#" * width)
      println
    }
  }
}
