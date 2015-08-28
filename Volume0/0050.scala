import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    println(StdIn.readLine().replace("peach", "tmp").replace("apple", "peach").replace("tmp", "apple"))
  }
}
