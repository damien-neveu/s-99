package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P23Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P23._

  val chars: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  "randomSelect" should "extract a given number of randomly selected elements from a list" in {
    val res = randomSelect(3, chars)
    res.toSet.size shouldBe 3
    res.forall(chars.contains) shouldBe true
  }

  it should "extract no more than the total number of elements in the input list" in {
    val res = randomSelect(1000, chars)
    res.toSet.size shouldBe chars.size
    res.forall(chars.contains) shouldBe true
  }

}
