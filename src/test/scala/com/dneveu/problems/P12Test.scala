package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P12Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P12._

  "decode" should "construct the uncompressed version of tuples (N, E) where N is the number of duplicates of the element E" in {
    val expectedResult = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal(expectedResult)
  }

}
