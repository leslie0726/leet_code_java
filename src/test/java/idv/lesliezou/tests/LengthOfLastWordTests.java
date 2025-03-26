package idv.lesliezou.tests;

import idv.lesliezou.algorithms.LengthOfLastWord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LengthOfLastWordTests {

    @Test
    public void testLengthOfLastWordSuccess() {
        LengthOfLastWord testObject = new LengthOfLastWord();
        Assertions.assertEquals(5, testObject.lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, testObject.lengthOfLastWord("   fly me   to   the moon  "));
        Assertions.assertEquals(6, testObject.lengthOfLastWord("luffy is still joyboy"));
    }
}
