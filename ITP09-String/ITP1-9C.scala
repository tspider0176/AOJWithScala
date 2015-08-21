import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines =
      for{
      in <- Source.stdin.getLines.toString.toList
    }yield in

    val point_a = "なんとかかんとか"
  }
}
