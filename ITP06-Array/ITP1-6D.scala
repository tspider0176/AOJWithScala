import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val num = StdIn.readLine().split(" ")
    var arr1 = Array.ofDim[Int](num(0).toInt, num(1).toInt)
    var arr2 = Array.ofDim[Int](1, num(1).toInt)
    var arr3 = Array.ofDim[Int](num(0).toInt, 1)

    for(i <- 0 until num(0).toInt){
      val line = StdIn.readLine().split(" ").map(_.toInt)
      
      for(j <- 0 until num(1).toInt){
        arr1(i)(j) = line(j)
      }
    }

    for(i <- 0 until num(1).toInt){
      arr2(0)(i) = StdIn.readLine().toInt
    }

    for(i <- 0 until num(0).toInt){
      for(j <- 0 until num(1).toInt){
        arr3(i)(0) += arr1(i)(j) * arr2(0)(j)
      }
    }

    for(i <- 0 until num(0).toInt){
      println(arr3(i)(0))
    }
  }
}
