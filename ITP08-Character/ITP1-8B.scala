import io.Source.stdin

object Main{
  def main(args: Array[String]){
    for(line <- stdin.getLines().toList){
      val sum = line.map{_.toString.toInt}.sum

      if (sum != 0){
        println(sum)
      }
    }
  }
}
