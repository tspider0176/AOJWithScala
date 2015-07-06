object Main{
  def main(args: Array[String]){
    val sc = new java.util.Scanner(System.in)
    val num = sc.nextInt
    var list = List[Long]()

    for(i <- 1 to num){
      val in = sc.nextInt
      list = in :: list
    }

    println(list.min + " " + list.max + " " + list.sum)
  }
}
