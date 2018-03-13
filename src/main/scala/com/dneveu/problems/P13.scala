package com.dneveu.problems

object P13 {

  def encodeDirect(l: List[Symbol]): List[(Int, Symbol)] = {
    def internal(currentList: List[Symbol], acc: List[(Int, Symbol)]): List[(Int, Symbol)] = currentList match {
      case head :: _ =>
        val prefixLength: Int = currentList.prefixLength(el => el == head)
        val rest: List[Symbol] = currentList.slice(prefixLength, currentList.size)
        internal(rest, (prefixLength, head) :: acc)
      case Nil => acc
    }
    internal(l, Nil).reverse
  }

}
