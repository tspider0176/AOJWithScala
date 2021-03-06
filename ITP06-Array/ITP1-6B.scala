import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val num = StdIn.readLine()
    val cards = Array.ofDim[Boolean](4, 14)

    (1 to num.toInt).foreach{ i =>
      val sai = StdIn.readLine().split(" ")
      sai(0) match{
        case "S" => cards(0)(sai(1).toInt) = true
        case "H" => cards(1)(sai(1).toInt) = true
        case "C" => cards(2)(sai(1).toInt) = true
        case "D" => cards(3)(sai(1).toInt) = true
        case _ =>
      }
    }

    for(i <- 0 to 3){
      for(j <- 1 to 13){
        if(cards(i)(j) == false){
          i match{
            case 0 => println("S " + j)
            case 1 => println("H " + j)
            case 2 => println("C " + j)
            case 3 => println("D " + j)
            case _ =>
          }
        }
      }
    }
  }
}
