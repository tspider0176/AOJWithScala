import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val line = StdIn.readLine().split(" ").map(_.toInt)
    val a = initArray(line(0), line(1))
    val b = initArray(line(1), line(2))
    val c = Array.ofDim[Long](line(0), line(2))

    for(i <- 1 to line(0)){
      for(j <- 1 to line(2)){
        for(k <- 1 to line(1)){
          c(i-1)(j-1) += a(i-1)(k-1) * b(k-1)(j-1)
        }
      }
    }

    for(i <- 0 until line(0)){
      for(j <- 0 until line(2)){
        print(c(i)(j))
        if(j != line(2) - 1){
          print(" ")
        }
      }
      println
    }
  }

  def initArray(i: Int, j: Int):Array[Array[Long]] ={
    val a = Array.ofDim[Long](i, j)

    for(index <- 0 until i){
      val line = StdIn.readLine().split(" ").map(_.toInt)
      for(index2 <- 0 until j){
        a(index)(index2) = line(index2)
      }
    }
    a
  }
}
