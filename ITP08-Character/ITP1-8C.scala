import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <- Source.stdin.getLines.toList
      } yield in.map(c => c.toLower)

    def numOfChar(s: String, c:Char):Int = {
      if(s.indexOf(c) == -1) 0
      else if(s.indexOf(c) >= 0) 1 + numOfChar(s.drop(s.indexOf(c)).tail, c)
      else 0
    }

    ('a' to 'z').foreach(c => println(c + " : " + numOfChar(line.mkString,c)))
  }
}
