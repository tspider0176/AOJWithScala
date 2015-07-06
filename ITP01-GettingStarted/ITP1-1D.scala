object Main{
  def main(args: Array[String]){
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt
    printf("%d:%d:%d\n", a/60/60, a/60%60, a%3600%60)
  }
}