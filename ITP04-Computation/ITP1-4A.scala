import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val list = StdIn.readLine.split(" ").toList.map(_.toInt)

    printf("%d %d %10.8f\n", list(0) / list(1), list(0) % list(1), list(0).toDouble / list(1).toDouble)
  }
}
