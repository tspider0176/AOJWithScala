import scala.io.StdIn
import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines = 
    	for{
    		in <- Source.stdin.getLines.toList
    	}yield in

    var h = List[Int]()
    for(i <- 1 to lines(1)){
    	h = lines(i+1) :: h
    }

    def reCatCard(s: String, i, Int):String ={
    	
    }

    lines(0).
  }
}
