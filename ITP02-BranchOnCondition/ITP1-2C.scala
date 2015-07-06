import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    var list = List[Int]()

    for(in <- StdIn.readLine.split(" ").map(_.toInt)){
      list = in :: list
    }

    list = list.sortWith((s,t: Int) => s < t)
    println(list.mkString(" "))
  }
}

