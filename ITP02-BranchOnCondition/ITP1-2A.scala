import scala.io.StdIn
 
object Main{
  def main(args: Array[String]){
    var list = List[Int]()
 
    for(in <- StdIn.readLine.split(" ").map(_.toInt)){
      list = in :: list
    }
 
    boc(list.reverse)
  }
 
  def boc(a: List[Int])={
    if(a(0) - a(1) == 0) println("a == b")
    else if(a(0) - a(1) > 0) println("a > b")
    else if(a(0) - a(1) < 0) println("a < b")
    else println()
  }
}