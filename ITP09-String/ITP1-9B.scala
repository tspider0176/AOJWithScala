import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines =
    	for{
        in <- Source.stdin.getLines.toList
    	}yield in.toString

    def reArrangeList(list: List[String]): List[List[String]] ={
      if(list == List("-"))
        List()
      else
        list.splitAt(list.tail.head.toInt + 2)._1 :: reArrangeList(list.splitAt(list.tail.head.toInt + 2)._2)
    }

    def reCatCard(s: String, h: List[Int]):String ={
      if(h.tail == Nil)
        s.dropRight(s.length - h.head).patch(0,s.drop(h.head),0)
      else
        reCatCard(s.dropRight(s.length - h.head).patch(0,s.drop(h.head),0), h.tail)
    }

    for(target <- reArrangeList(lines)){
      println(reCatCard(target.head, target.tail.tail.map(_.toInt)))
    }
  }
}
