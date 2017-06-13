import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    
    for{
      in <- inputs
      val Array(a, b, c, _*) = in.split(" ").map(_.toInt)
    } (a, b, c) match {
      case (-1, -1, -1)
      case (-1, _, _) => println("F")
      case (_ ,-1, _) => println("F")
      case (a, b, c) if a+b >= 80 => println("A")
      case (a, b, c) if a+b >= 65 && a+b < 80 => println("B")
      case (a, b, c) if a+b >= 50 && a+b < 65 => println("C")
      case (a, b, c) if a+b >= 30 && a+b < 50 && c < 50 => println("D")
      case (a, b, c) if c >= 50 => println("C")
      case (a, b, c) if a+b < 30 => println("F")
      case _ =>
    }
  }
}
