import scala.io.Source

object Main{
  def main(args: Array[String]){
    val list =
      for{
        in <- Source.stdin.getLines.toList.map(_.toInt)
      } yield in

    for(i <- 0 until list.length){
      if(list(list.length - i - 1).size > 4){
        val arr = list(list.length - i - 1).split(Array(' '))

        arr(1) match {
          case "+" => println(arr(0).toInt + arr(2).toInt)
          case "-" => println(arr(0).toInt - arr(2).toInt)
          case "*" => println(arr(0).toInt * arr(2).toInt)
          case "/" => println(arr(0).toInt / arr(2).toInt)
          case "?" =>
        }
      }
    }
  }
}
