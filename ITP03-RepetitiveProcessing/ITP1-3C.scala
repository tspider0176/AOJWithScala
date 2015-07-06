import scala.io.Source

object Main{
  def main(args: Array[String]){
    var list = List[String]()
    for(in <- Source.stdin.getLines.toList){
      list = in :: list
    }

    for(i <- 0 until list.length){
      val arr = list(list.length - i - 1).split(Array(' ')).map(_.toInt)

      if(!(arr(0) == 0 && arr(1) == 0)){
        if(arr(0) > arr(1)){
          println(arr(1) + " " + arr(0))
        }
        else{
          println(arr(0) + " " + arr(1))
        }
      }
    }
  }
}
