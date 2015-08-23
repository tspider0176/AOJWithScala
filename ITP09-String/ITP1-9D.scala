import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    }yield in

    recStrArrange(lines(0), lines.drop(2))
  }

  def recStrArrange(s: String, ops: List[String]): String ={
    if(ops == Nil){
      s
    }
    else if(ops.head.split(" ").toList.head != "print"){
      val opnow = ops.head.split(" ").toList
      val res = opnow.head match{
        case x if(x == "replace") => replaceStr(s, opnow.tail)
        case x if(x == "reverse") => reverseStr(s, opnow.tail)
        case _ =>
      }

      recStrArrange(res.toString, ops.tail)
    }
    else{
      val opnow = ops.head.split(" ").toList
      println(s.drop(opnow.tail.head.toInt).dropRight(s.length - opnow.last.toInt - 1))
      recStrArrange(s, ops.tail)
    }
  }

  def replaceStr(s: String, list: List[String]): String ={
    s.patch(list.head.toInt, list.last, list.last.length)
  }

  def reverseStr(s: String, list: List[String]): String ={
    val t1 = s.substring(list.head.toInt, list.last.toInt + 1).reverse.patch(0, s.dropRight(s.length - list.head.toInt), 0)
    t1 + s.drop(t1.length)
  }
}
