package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P15Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P15._

  "duplicateN" should "duplicate the elements of a list a given number of times" in {
    val expectedResult = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should equal(expectedResult)
  }

}
