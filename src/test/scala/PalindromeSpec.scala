import org.scalatest.flatspec.AnyFlatSpec

class PalindromeSpec extends AnyFlatSpec{

  "checkPalindrome" should
    "return false for an empty string" in {
      assert(!Palindrome.checkPalindrome(""))
    }

  it should "return true for a string consisting of one letter" in {
    assert(Palindrome.checkPalindrome("a"))
  }

  it should "return false for a string consisting of two different letters" in {
    assert(!Palindrome.checkPalindrome("ab"))
  }

  it should "return true for a string consisting of two same letters" in {
    assert(Palindrome.checkPalindrome("aa"))
  }

  it should "return false for a sequence of random characters" in {
    assert(!Palindrome.checkPalindrome("aabhjlllsh"))
  }

  it should "return true for a palindrome" in {
    assert(Palindrome.checkPalindrome("madam"))
  }

  it should "return true for a palindrome sentence" in {
    assert(Palindrome.checkPalindrome("Nurses run"))
  }

  it should "return false for a random sentence" in {
    assert(!Palindrome.checkPalindrome("This is a test sentence"))
  }


  "checkPercentagePalindrome" should "return 0 for an empty string" in {
    assert(Palindrome.checkPercentagePalindrome("") == 0)
  }

  it should "return 100 for a single letter string" in {
    assert(Palindrome.checkPercentagePalindrome("a") == 100)
  }

  it should "return 100 for a string consisting of two same letters" in {
    assert(Palindrome.checkPercentagePalindrome("aa") == 100)
  }

  it should "return 50 for a string consisting of two different letters" in {
    assert(Palindrome.checkPercentagePalindrome("ab") == 50)
  }

  it should "return 100 for a palindrome word" in {
    assert(Palindrome.checkPercentagePalindrome("madam") == 100)
  }

  it should "return 100 for a palindrome sentence" in {
    assert(Palindrome.checkPercentagePalindrome("Nurses run") == 100)
  }

  it should "return 80 for a 5 letter word where one letter change would make it a palindrome" in {
    assert(Palindrome.checkPercentagePalindrome("radas") == 80)
  }

  it should "return 70 for a 10 letter word where 3 letter change would make it a palindrome" in {
    assert(Palindrome.checkPercentagePalindrome("baaaaacwaa") == 70)
  }

}
