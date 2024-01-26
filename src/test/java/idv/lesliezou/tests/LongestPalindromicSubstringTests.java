package idv.lesliezou.tests;

import idv.lesliezou.algorithms.LongestPalindromicSubstring;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class LongestPalindromicSubstringTests {

    @Test
    public void testLongestPalindromicSubstringSuccess() {
        LongestPalindromicSubstring testObject = new LongestPalindromicSubstring();
        Assertions.assertEquals("bab", testObject.longestPalindrome("babad"));
        Assertions.assertEquals("bb", testObject.longestPalindrome("cbbd"));
        Assertions.assertEquals("a", testObject.longestPalindrome("a"));
        Assertions.assertEquals("a", testObject.longestPalindrome("ac"));
        Assertions.assertEquals("aca", testObject.longestPalindrome("aacabdkacaa"));
        Assertions.assertEquals("bb", testObject.longestPalindrome("bb"));
        Assertions.assertEquals("aaaa", testObject.longestPalindrome("aaaa"));
        Assertions.assertEquals("ccc", testObject.longestPalindrome("ccc"));
        Assertions.assertEquals("tattarrattat", testObject.longestPalindrome("tattarrattat"));
    }


}