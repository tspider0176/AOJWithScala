import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    var list = List[Int]()

    for(in <- StdIn.readLine.split(" ").map(_.toInt)){
      list = in :: list
    }

    list = list.reverse
    val w = list(0)
    val h = list(1)
    val x = list(2)
    val y = list(3)
    val r = list(4)

    if((x+r) > w || (x-r) < 0 || (y+r) > h || (y-r) < 0){
      println("No")
    }
    else{
      println("Yes")
    }
  }
}
