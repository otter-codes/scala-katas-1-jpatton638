package App

import scala.io.StdIn

/**
  * Created by john on 01/02/18.
  */
object RemoveFirstAndLast extends App {

  def removeHeadAndTail(input: String): Option[String] = {
    println(input.tail.init)
    Some(input)
  }

  val input = StdIn.readLine("")
  removeHeadAndTail(input)

}
