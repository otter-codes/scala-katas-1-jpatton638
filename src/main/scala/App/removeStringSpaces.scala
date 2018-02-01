package App

object removeStringSpaces extends App{

  def stripSpaces(string: String): Unit = {
    val stringList = string.split(" ").toList

    stringList.foreach(print)
  }

  stripSpaces("Hello there")
}
