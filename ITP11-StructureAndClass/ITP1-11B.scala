import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val label = StdIn.readLine.split(" ").toList.map(_.toInt)
    val q = Iterator.continually(StdIn.readLine).takeWhile(_ != null).toList
    val dice = new Dice(label)

    println(q.tail.map(_.split(" ").toList.map(_.toInt)).map(dice.findRight(_)).mkString("\n"))
  }
}

class Dice(sur: List[Int]){
  private val index: List[Int] = sur

  def findRight(list: List[Int]): Int={
    val dice = new Dice(index)
    val kindOfDices = List[Dice](dice, dice.rotN, dice.rotS, dice.rotW, dice.rotE, dice.rotN.rotN)

    val finddice = for{
      kindOfDice <- kindOfDices
    }yield kindOfDice match{
      case x if(x.getVal(0) == list(0) && x.getVal(1) == list(1)) => x.getVal(2)
      case x if(x.rotR.getVal(0) == list(0) && x.rotR.getVal(1) == list(1)) => x.rotR.getVal(2)
      case x if(x.rotR.rotR.getVal(0) == list(0) && x.rotR.rotR.getVal(1) == list(1)) => x.rotR.rotR.getVal(2)
      case x if(x.rotR.rotR.rotR.getVal(0) == list(0) && x.rotR.rotR.rotR.getVal(1) == list(1)) => x.rotR.rotR.rotR.getVal(2)
      case _ => 0
    }

    finddice.sum
  }

  def getVal(i: Int): Int = index(i)

  def rotR(): Dice =
    new Dice(index).rotS.rotW.rotN

  def rotN(): Dice =
    new Dice(List[Int](index(1), index(5), index(2), index(3), index(0), index(4)))

  def rotS(): Dice =
    new Dice(List[Int](index(4), index(0), index(2), index(3), index(5), index(1)))

  def rotW(): Dice =
    new Dice(List[Int](index(2), index(1), index(5), index(0), index(4), index(3)))

  def rotE(): Dice =
    new Dice(List[Int](index(3), index(1), index(0), index(5), index(4), index(2)))
}
