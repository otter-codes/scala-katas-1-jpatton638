package App

import scala.io.StdIn

/**
  * Created by john on 01/02/18.
  */
object RemoveFirstAndLast extends App {

  def removeHeadAndTail(input: String): String = {
    if (!input.equals("")) {
      println(input.tail.init)
      input
    } else {
      println("Nothing entered")
      "No string entered"
    }
  }

  val input = StdIn.readLine("")
  removeHeadAndTail(input)

}
