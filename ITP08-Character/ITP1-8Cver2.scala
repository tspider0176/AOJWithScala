import scala.io.Source

object Main{
  def main(args: Array[String]){
    val line =
      for{
        in <- Source.stdin.getLines.toList
      } yield in.map(_.toLower)

      val atoz = 'a' to 'z'
      val filteredSting = line.mkString.map(_.toLower).filter(atoz.contains(_))
      println((filteredSting + atoz.mkString).groupBy(n => n).toList.sorted.map{
        case (k,v) => s"$k : ${v.length - 1}"
      }.mkString("\n"))
  }
}
