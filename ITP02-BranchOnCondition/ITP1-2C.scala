import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    println(StdIn.readLine.split(" ").map(_.toInt).sortWith((s,t: Int) => s < t).toList.mkString(" "))
  }
}
