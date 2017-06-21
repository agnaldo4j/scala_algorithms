package br.codesimples.algorithms

import scala.annotation.tailrec

class ArrayEquilibrium {

  def solution(array:Array[Int]): Int = {
    execute(0, 0, array) match {
      case Some(index) => index
      case None => -1
    }
  }

  @tailrec
  private def execute(index:Int, leftSum:Long, array:Array[Int]): Option[Int] = {
    if(array.isEmpty && index == 0) None
    else if((array.isEmpty && index > 0) && leftSum == 0) Some(index)
    else if(array.tail.isEmpty && index == 0) Some(index)
    else if (leftSum == array.tail.foldLeft(0L)(_+_)) Some(index)
    else if (!array.tail.isEmpty) execute(index + 1, leftSum + array.head, array.tail)
    else None
  }
}
