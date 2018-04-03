package com.dneveu.problems

object P19 {

  def rotate(n: Int, symbols: List[Symbol]): List[Symbol] = {
    def internal(en: Int, syms: List[Symbol]): List[Symbol] =
      if (en == 0) {
        syms
      }
      else if (en > 0) {
        internal(en - 1, syms.tail :+ syms.head)
      }
      else {
        internal(en + 1, syms.last :: syms.init)
      }
    internal(n % symbols.size, symbols)
  }

}
