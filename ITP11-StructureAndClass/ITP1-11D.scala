import scala.io.Source

object Main{
  def main(args: Array[String]){
    val dices = for{
      in <- Source.stdin.getLines.toList
    } yield in

    val targets = dices.tail.map(_.split(" ").toList.map(_.toInt)).combinations(2)
    val list = for{
      target <- targets
    } yield {
      val dice1 = new Dice(target.head)
      val dice2 = new Dice(target.last)
      dice1.isEqual(dice2)
    }

    println(if(!list.foldLeft(false)((a,b) => a || b)) "Yes" else "No")
  }
}

class Dice(sur: List[Int]){
  private val index: List[Int] = sur

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

    torf.foldLeft(false)((a,b) => a || b)
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
