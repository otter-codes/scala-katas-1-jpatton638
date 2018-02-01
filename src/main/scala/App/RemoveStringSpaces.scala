package App

import scala.io.StdIn

object RemoveStringSpaces extends App {

  def stripSpaces(string: String): Unit = {
    val stringList = string.split(" ").toList

    stringList.foreach(print)
  }

  val input = StdIn.readLine("")
  stripSpaces(input)
}