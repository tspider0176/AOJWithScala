import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val sur = StdIn.readLine.split(" ").toList.map(_.toInt)
    val ops = StdIn.readLine

    val dice = new Dice(sur)
    println(appOp(dice, ops).head)
  }

  def appOp(dice: Dice, ops: String): List[Int] ={
    if(ops == "") dice.index
    else
      ops.head match{
      case 'N' => appOp(new Dice(dice.rotN()), ops.tail)
      case 'S' => appOp(new Dice(dice.rotS()), ops.tail)
      case 'W' => appOp(new Dice(dice.rotW()), ops.tail)
      case 'E' => appOp(new Dice(dice.rotE()), ops.tail)
      case _ => List()
    }
  }
}

class Dice(sur: List[Int]){
  val index: List[Int] = sur

  def rotN(): List[Int] =
    List[Int](index(1), index(5), index(2), index(3), index(0), index(4))

  def rotS(): List[Int] =
    List[Int](index(4), index(0), index(2), index(3), index(5), index(1))

  def rotW(): List[Int] =
    List[Int](index(2), index(1), index(5), index(0), index(4), index(3))

  def rotE(): List[Int] =
    List[Int](index(3), index(1), index(0), index(5), index(4), index(2))
}
