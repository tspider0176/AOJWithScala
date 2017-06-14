import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val list = StdIn.readLine.split(" ").map(_.toInt)

    val w = list(0)
    val h = list(1)
    val x = list(2)
    val y = list(3)
    val r = list(4)

    if((x+r) > w || (x-r) < 0 || (y+r) > h || (y-r) < 0) println("No")
    else println("Yes")
  }
}
