import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val num = StdIn.readLine().toInt
    val arr = Array.ofDim[Int](4,3,10)

    (1 to num).foreach{i =>
      val in = StdIn.readLine().split(" ").map(_.toInt).toList
      arr(in(0) - 1)(in(1) - 1)(in(2) - 1) += in(3)
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
