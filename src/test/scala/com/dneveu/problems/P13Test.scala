package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P13Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P13._

  "encodeDirect" should "implement the run-length encoding data compression method directly" in {
    val expectedResult = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(expectedResult)
  }

}
