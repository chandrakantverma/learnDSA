package example.basics.recursion.pallindromString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeStringTest {
  public boolean checkPalindrome(String str) {
    return checkPalindromeRec(str, 0, str.length());
  }

  private boolean checkPalindromeRec(String str, int i, int n) {
    if (str.charAt(i) != str.charAt(n - 1 - i)) return false;
    if (i >= n / 2) return true;
    return checkPalindromeRec(str, i + 1, n);
  }

  @Test
  public void testCheckPalindrome() {
    Assertions.assertTrue(checkPalindrome("xex"));
  }

  @Test
  public void testCheckPalindrome1() {
    Assertions.assertTrue(checkPalindrome("12321"));
  }
}
