package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P16Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P16._

  "drop" should "Drop every Nth element from a list" in {
    val expectedResult = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(expectedResult)
  }

}
