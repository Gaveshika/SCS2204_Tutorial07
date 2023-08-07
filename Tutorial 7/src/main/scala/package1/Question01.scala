package package1
import scala.io.StdIn.{readInt, readLine};

object Question01 extends App{

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(number => number % 2 == 0)
  }

  val inputList  = readLine("Enter a list of integers : ").split (" ").map(_.toInt).toList    //separate inputs by spaces

  val outputList = filterEvenNumbers(inputList)
  println("Filtered out Even Numbers from the list :" +outputList)

}
