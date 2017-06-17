import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val num = StdIn.readLine().split(" ").map(_.toInt).toList
    val arr1 = Array.ofDim[Int](num(0), num(1))
    val arr2 = Array.ofDim[Int](1, num(1))
    val arr3 = Array.ofDim[Int](num(0), 1)

    (0 to num(0) - 1).foreach{ i =>
      val line = StdIn.readLine().split(" ").map(_.toInt)

      (0 to num(0) - 1).foreach{ j =>
        arr1(i)(j) = line(j)
      }
    }

    (0 to num(1) - 1).foreach{ i =>
      arr2(0)(i) = StdIn.readLine().toInt
    }

    (0 to num(0) - 1).foreach{ i =>
      (0 to num(0) - 1).foreach{ j =>
        arr3(i)(0) += arr1(i)(j) * arr2(0)(j)
      }
    }

    (0 to num(0) - 1).foreach{ i =>
      println(arr3(i)(0))
    }
  }
}
