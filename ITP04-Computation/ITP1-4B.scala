import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val in = StdIn.readLine.split(" ").map(_.toDouble)

    printf("%.6f %.6f\n", in.head * in.head * math.Pi, 2 * in.head * math.Pi)
  }
}
