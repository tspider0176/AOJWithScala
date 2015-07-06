import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val num = StdIn.readLine()
    var arr = Array.ofDim[Int](4,3,10)

    for(i <- 1 to num.toInt){
      val in = StdIn.readLine().split(" ")
      arr(in(0).toInt-1)(in(1).toInt-1)(in(2).toInt-1) += in(3).toInt
    }

    for(i <- 0 until 4){
      for(j <- 0 until 3){
        for(k <- 0 until 10){
          print(" " + arr(i)(j)(k))
        }
        println
      }
      if(i != 3){
        println("####################")
      }
    }
  }
}
