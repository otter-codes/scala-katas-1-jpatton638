package App

import scala.io.StdIn

object RemoveStringSpaces extends App {

  def stripSpaces(string: String): String = {
    val stringList = string.split(" ").toList

    val strippedString = stringList.mkString("")
    strippedString
  }

  val input = StdIn.readLine("Enter a string: ")
  println(stripSpaces(input))
}