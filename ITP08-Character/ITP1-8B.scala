import io.Source.stdin

object Main{
  def main(args: Array[String]){
    for(line <- stdin.getLines().toList){
      val sum = line.map{c => c.toString.toInt}.foldLeft(0)((acc, a) => acc + a)

      if (sum != 0){
        println(sum)
      }
    }
  }
}
