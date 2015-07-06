import scala.io.StdIn
 
object Main{
  def main(args: Array[String]){
    var list = List[Int]()
 
    for(in <- StdIn.readLine.split(" ").map(_.toInt)){
      list = in :: list
    }
 
    printf("%d %d %10.8f\n", list(1) / list(0), list(1) % list(0),list(1).toDouble / list(0).toDouble)
  }
}