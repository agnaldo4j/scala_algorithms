package br.codesimples.algorithms

import org.specs2.mutable.Specification

class ArrayEquilibriumSpec extends Specification {
  isolated
  sequential
  "The array equilibrium showd" should {
    args(sequential = true, isolated = true)
    "verify equilibrium" ! workerForTest().verifyEquilibrium()
    "verify negative values" ! workerForTest().verifyNegativeValues()
    "verify long array equilibrium" ! workerForTest().verifyLongArrayEquilibrium()
  }

  case class workerForTest() {
    def verifyEquilibrium() = {
      val array = Array[Int](-1, 3, -4, 5, 1, -6, 2, 1)
      new ArrayEquilibrium().solution(array) must be equalTo (1)
    }

    def verifyNegativeValues() = {
      val array = Array[Int](0, -2147483648, -2147483648)
      new ArrayEquilibrium().solution(array) must be equalTo (-1)
    }

    def verifyLongArrayEquilibrium() = {
      val array = Array[Int](-1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1, -1, 3, -4, 5, 1, -6, 2, 1)
      new ArrayEquilibrium().solution(array) must be equalTo (28)
    }
  }
}