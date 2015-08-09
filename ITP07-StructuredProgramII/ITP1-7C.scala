import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val n = StdIn.readLine().split(" ").map(_.toInt)
    var arr = Array.ofDim[Int](n(0) + 1, n(1) + 1)

    for(in <- 1 to n(0)){
      val line = StdIn.readLine().split(" ").map(_.toInt)

      for(in2 <- 1 to n(1)){
        arr(in - 1)(in2 - 1) = line(in2 - 1)
        arr(n(0))(in2 - 1) += line(in2 - 1)
      }
      arr(in - 1)(n(1)) = line.sum
      arr(n(0))(n(1)) += line.sum
    }

    for(in <- 1 to n(0)+1){
      for(in2 <- 1 to n(1)+1){
        print(arr(in - 1)(in2 - 1))
        if(in2 != n(1)+1){
          print(" ")
        }
      }
      println
    }
  }
}
