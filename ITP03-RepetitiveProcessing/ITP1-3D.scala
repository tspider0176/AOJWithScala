import scala.io.StdIn
 
object Main{
  def main(args: Array[String]){
    var list = List[Int]()
 
    for(in <- StdIn.readLine.split(" ").map(_.toInt)){
      list = in :: list
    }
 
    var count = 0
    for(i <- list(2) to list(1)){
      if(list.head % i == 0){
        count = count + 1
      }
    }
 
    println(count)
  }
}