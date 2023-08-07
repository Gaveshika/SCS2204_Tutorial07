package package1
import scala.io.StdIn.{readInt , readLine}

object Question03 extends App{

  def primeCheck(number:Int): Boolean = {
    if (number <= 1) false
    else if (number <= 3) true
    else if (number % 2 == 0 || number % 3 == 0) false
    else {
      var x = 5
      while (x * x <= number) {
        if (number % x == 0 || number % (x + 2) == 0) {
          return false
        }
        x += 6
      }
      true
    }
  }
    def filterPrime( numbers: List[Int]): List[Int] = {
      numbers.filter(primeCheck)
    }
  val inputList = readLine("Enter list of integers :").split(" ").map(_.toInt).toList //separate inputs by spaces
  val outputList = filterPrime(inputList)
  println("Prime number list of the input numbers: " + outputList)
}
