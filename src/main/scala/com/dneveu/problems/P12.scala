package com.dneveu.problems

object P12 {

  def decode(l: List[(Int, Symbol)]): List[Symbol] =
    l.foldLeft(List.empty[Symbol]) { case (acc, (num, symbol)) =>
      List.fill(num)(symbol) ::: acc
    }.reverse

}
