package com.dt.scala.hello

object HelloScala {
  def main(args: Array[String]): Unit = {
//    Unit代表空的返回内容
//    println("Hello Scala! A new world!")
    for(arg <- args) println(arg)
//    doWhile()
    println(looper(100, 298))

//    var file = "scala.txt"
//    if(!args.isEmpty) file = args(0)

    val file = if(!args.isEmpty) args(0) else "scala.xml"
    println(file)

    val files = (new java.io.File(".")).listFiles()

    for(file <- files){
      println(file)
    }

//    for (i <- 1 to 10)
//        println("Number is :" + i)

      for (i <- 1.to(10)){
        println("Number is :" + i)
      }

  }

  def doWhile(): Unit ={
    var line = ""
      do {
        line = readLine()
          println("Read: " + line)

      }while (line != "")
  }

  def looper(x : Long, y : Long): Long ={
    var a = x
    var b = y
    while(a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
}
