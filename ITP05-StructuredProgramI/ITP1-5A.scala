import scala.io.Source

object Main{
  def main(args: Array[String]){
    var list = List[String]()
    for(in <- Source.stdin.getLines.toList){
      list = in :: list
    }

    for(i <- 0 until list.length){
      val arr = list(list.length - i - 1).split(Array(' '))

      if(!(arr(0).toInt == 0 && arr(1).toInt == 0)){
        for(i <- 0 until arr(0).toInt){
          for(j <- 0 until arr(1).toInt){
            print("#")
          }
          println
        }
        println
      }
    }
  }
}
