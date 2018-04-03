package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P20Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P20._

  val chars: List[Symbol] = List('a, 'b, 'c, 'd)

  "removeAt" should "return the list and the removed element in a Tuple" in {
    removeAt(1, chars) shouldBe (List('a, 'c, 'd), 'b)
  }

}
