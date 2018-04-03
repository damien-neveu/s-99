package com.dneveu.problems

object P18 {

  def slice(fromIncl: Int, tillExcl: Int, symbols: List[Symbol]): List[Symbol] =
    symbols.zipWithIndex.flatMap { case (symbol, index) =>
      if (index >= fromIncl && index < tillExcl) {
        Some(symbol)
      }
      else {
        None
      }
    }

}
