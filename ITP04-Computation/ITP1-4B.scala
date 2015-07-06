import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val in = StdIn.readLine.split(" ").map(_.toDouble)

    printf("%.6f %.6f\n", in(0)*in(0)*math.Pi, 2*in(0)*math.Pi)
  }
}
