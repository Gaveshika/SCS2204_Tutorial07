package package1

import scala.io.StdIn.{readInt , readLine}

object Question02 extends App{

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }

  val inputList = readLine("Enter list of integers :").split (" ").map(_.toInt).toList  //separate inputs by spaces
  val outputList= calculateSquare(inputList)
  println("Squares of the input numbers: "+outputList)

}
