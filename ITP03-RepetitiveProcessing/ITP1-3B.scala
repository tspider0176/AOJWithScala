import scala.io.Source

object Main{
  def main(args: Array[String]){
    var list = List[String]()
    for(in <- Source.stdin.getLines.toList){
      list = in :: list
    }

    for(i <- 1 to list.length){
      if(list(list.length - i) != "0"){
        println("Case " + i + ": " + list(list.length - i))
      }
    }
  }
}