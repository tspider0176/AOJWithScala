import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val dice1 = new Dice(StdIn.readLine.split(" ").toList.map(_.toInt))
    val dice2 = new Dice(StdIn.readLine.split(" ").toList.map(_.toInt))

    println(if(dice1.isEqual(dice2)) "Yes" else "No")
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

  def isEqual(dice2:Dice): Boolean={
    val dice = new Dice(index)
    val kindOfDices = List[Dice](dice, dice.rotN, dice.rotS, dice.rotW, dice.rotE, dice.rotN.rotN)

    val torf = for{
      kindOfDice <- kindOfDices
    } yield kindOfDice match{
      case x if(x.index == dice2.index) => true
      case x if(x.rotR.index == dice2.index) => true
      case x if(x.rotR.rotR.index == dice2.index) => true
      case x if(x.rotR.rotR.rotR.index == dice2.index) => true
      case _ => false
    }

    def recConfirm(list: List[Boolean]): Boolean={
      if(list == Nil) false
      else list.head || recConfirm(list.tail)
    }

    recConfirm(torf)
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
