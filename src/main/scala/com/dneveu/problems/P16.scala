package com.dneveu.problems

object P16 {

  def drop(n: Int, symbols: List[Symbol]): List[Symbol] =
    symbols.zipWithIndex.foldLeft(List.empty[Symbol]) { case (acc, (symbol, index)) =>
      if ((index+1) % n == 0) {
        acc
      }
      else {
        symbol :: acc
      }
    }.reverse

}
