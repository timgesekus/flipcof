package example

import org.scalatest.Spec
import org.scalatest.junit.ShouldMatchersForJUnit
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class BankSpec extends Spec with ShouldMatchersForJUnit {
  describe("A Bank") {
    describe("(when new)") {
      val bank = new Bank
      it("should have balance 0") {
        bank.balance should be(0)
      }
    }
    describe("after deposit of 100") {
      val bank = new Bank
      bank.deposit(100)
      it("should have a balance of 100") {
        bank.balance should be(100)
      }
      it("should be 0 after withdraw of 100") {
        bank.withdraw(100)
        bank.balance should be(0)        
      }
    }
  }
}

