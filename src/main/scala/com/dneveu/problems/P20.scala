package com.dneveu.problems

object P20 {

  def removeAt(i: Int, symbols: List[Symbol]): (List[Symbol], Symbol) =
    (symbols.zipWithIndex.flatMap { case (symbol, index) =>
      if (index == i) {
        None
      }
      else {
        Some(symbol)
      }
    }, symbols(i))

}
