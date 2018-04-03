package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P18Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P18._

  "slice" should "extract a slice from a list between included index I and excluded index K" in {
    val expectedResult = List('d, 'e, 'f, 'g)
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(expectedResult)
  }

  it should "return empty List if I and K are out of bound" in {
    slice(12, 15, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe List.empty[Symbol]
  }

}
