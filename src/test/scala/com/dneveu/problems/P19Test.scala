package com.dneveu.problems

import org.scalatest.{FlatSpec, Matchers}

class P19Test extends FlatSpec with Matchers {

  import com.dneveu.problems.P19._

  val chars: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  "rotate" should "rotate a list N places to the left" in {
    rotate(3, chars) should equal(
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    )
  }

  it should "rotate a list N places to the right if N is negative" in {
    rotate(-2, chars) should equal(
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    )
  }

  it should "leave a list in place if N is a number that rotates elements back in place" in {
    rotate(22, chars) should equal(chars)
  }

}
