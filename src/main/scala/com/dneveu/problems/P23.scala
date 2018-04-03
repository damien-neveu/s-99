package com.dneveu.problems

object P23 {
  import P20._

  def randomSelect(n: Int, symbols: List[Symbol]): List[Symbol] = {
    def selec(en: Int, currSymbols: List[Symbol], acc: List[Symbol]): List[Symbol] =
      if (en <= 0 || currSymbols.isEmpty) {
        acc
      }
      else {
        val (remainingSymbols, randomSymbol) = removeAt(scala.util.Random.nextInt(currSymbols.size), currSymbols)
        selec(en - 1, remainingSymbols, randomSymbol :: acc)
      }
    selec(n, symbols, Nil)
  }

}
