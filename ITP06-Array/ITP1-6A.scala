import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val in2 = StdIn.readLine().split(" ").map(_.toInt).reverse

    println(in2.mkString(" "))
  }
}
