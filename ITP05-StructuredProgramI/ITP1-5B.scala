import scala.io.Source

object Main{
  def main(args: Array[String]){
    var list = List[String]()
    for(in <- Source.stdin.getLines.toList){
      list = in :: list
    }

    for(i <- 1 to list.length){
      val arr = list(list.length - i).split(Array(' '))

      if(!(arr(0).toInt == 0 && arr(1).toInt == 0)){
        for(i <- 0 until arr(0).toInt){
          for(j <- 0 until arr(1).toInt){
            i match{
              case 0 => print("#")
              case x if(x == arr(0).toInt-1) => print("#")
              case _ => j match{
                case 0 => print("#")
                case y if(y == arr(1).toInt-1) => print("#")
                case _ => print(".")
              }
            }
          }
          println
        }
        println
      }
    }
  }
}
