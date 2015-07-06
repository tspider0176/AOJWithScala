object Main{
  def main(args: Array[String]){
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt
    val b = sc.nextInt
    printf("%d %d\n", a * b, a*2 + b*2)
  }
}