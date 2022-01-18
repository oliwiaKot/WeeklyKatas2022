
case object Palindrome {

  def checkPalindrome(input: String) = {
    val processedInput = input.replaceAll("\\s", "").toLowerCase
    processedInput.length match {
      case 0 => false
      case 1 => true
      case _ =>
        val halfLength = processedInput.length/2
        val firstHalf = processedInput.substring(0, halfLength)
        val secondHalf = processedInput.reverse.substring(0, halfLength)
        firstHalf == secondHalf
    }
  }

  def checkPercentagePalindrome(input: String) = {
    val processedInput = input.replaceAll("\\s", "").toLowerCase
    val length = processedInput.length
    length match {
      case 0 => 0
      case 1 => 100
      case _ =>
        val halfLength = processedInput.length/2
        val firstHalf = processedInput.substring(0, halfLength)
        val secondHalf = processedInput.reverse.substring(0, halfLength)
        val lettersToChange = compare(firstHalf, secondHalf)
        (length.toFloat - lettersToChange.toFloat)*100/length.toFloat
    }
  }

  private def compare(first: String, second: String, index: Int = 0, differentLetterCount: Int = 0): Int = {
    if(index == first.length){
      differentLetterCount
    } else {
      if (first.charAt(index).toString == second.charAt(index).toString) {
        compare(first, second, index + 1, differentLetterCount)
      } else {
        compare(first, second, index + 1, differentLetterCount + 1)
      }
    }
  }
}
