package com.dneveu.problems

object P15 {

  def duplicateN(n: Int, symbols: List[Symbol]): List[Symbol] =
    symbols.foldLeft(List.empty[Symbol]) { case (acc, symbol) =>
      List.fill(n)(symbol) ::: acc
    }.reverse

}
