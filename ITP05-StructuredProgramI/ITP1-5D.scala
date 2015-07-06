import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val in = StdIn.readLine()
    var f = false

    for(i <- 1 to in.toInt){
      var x = i
      if(x % 3 == 0){
        print(" " + i)
      }
      else{
        do{
          if(x % 10 == 3){
            print(" " + i)
            f = true
          }

          x = x / 10
        }while(x != 0 && f == false)
        f = false
      }
    }

    println()
  }
}
