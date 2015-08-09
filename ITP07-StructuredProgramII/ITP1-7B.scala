import scala.io.Source

object Main{
  def main(args: Array[String]){
    var list = List[String]()
    for(in <- Source.stdin.getLines.toList){
      list = in :: list
    }

    var count = 0
    for(in <- 1 to list.length){
      val num = list(list.length - in).split(" ").map(_.toInt)

      for(i <- 1 to num(0)){
        for(j <- i+1 to num(0)){
         for(k <- j+1 to num(0)){
           if(i + j + k == num(1)){
              count += 1
            }
          }
        }
      }

      if(num(0) > 0){
        println(count)
        count = 0
      }
    }
  }
}
