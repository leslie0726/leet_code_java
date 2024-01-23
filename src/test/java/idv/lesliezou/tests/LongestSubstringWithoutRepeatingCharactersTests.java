package idv.lesliezou.tests;

import idv.lesliezou.algorithms.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class LongestSubstringWithoutRepeatingCharactersTests {

    @Test
    public void testLongestSubstringWithoutRepeatingCharactersSuccess() {
        LongestSubstringWithoutRepeatingCharacters testObject = new LongestSubstringWithoutRepeatingCharacters();

        Assertions.assertEquals(testObject.lengthOfLongestSubstring("abcabcbb"),3);
        Assertions.assertEquals(testObject.lengthOfLongestSubstring("bbbbb"),1);
        Assertions.assertEquals(testObject.lengthOfLongestSubstring("pwwkew"),3);
        Assertions.assertEquals(testObject.lengthOfLongestSubstring("dvdf"),3);
        Assertions.assertEquals(testObject.lengthOfLongestSubstring("abba"),2);
        Assertions.assertEquals(testObject.lengthOfLongestSubstring("tmmzuxt"),5);


    }



}