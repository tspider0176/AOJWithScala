import io.Source.stdin

object Main{
  def main(args: Array[String]){
    for(line <- stdin.getLines().toList){
      var sum = 0

      for(i <- 0 to line.length - 1){
        sum += line(i).toInt - 48
      }

      if(sum != 0){
        println(sum)
      }
    }
  }
}
