import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <-Source.stdin.getLines.toList
      } yield in

    def countNumOfStr(s:String, w:String):Int ={
      if(s.contains(w) == false) 0
      else if(s.contains(w) == true) 1 + countNumOfStr(s.drop(s.indexOfSlice(w) + w.length), w)
      else 0
    }

    println(line.tail.mkString("\n"))

    println(countNumOfStr(line.tail.mkString("\n"), line(0)))
  }
}
