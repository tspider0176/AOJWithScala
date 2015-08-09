object Main{
  def main(args: Array[String]){
    println(scala.io.StdIn.readLine().map(c => if(c.isUpper) c.toLower else c.toUpper))
  }
}
