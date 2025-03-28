package idv.lesliezou.tests;

import idv.lesliezou.algorithms.PlusOne;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PlusOneTests {
    @Test
    public void testPlusOneTestSuccess() {
        PlusOne testObject = new PlusOne();
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, testObject.plusOne(new int[]{1, 2, 3}));
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, testObject.plusOne(new int[]{4, 3, 2, 1}));
        Assertions.assertArrayEquals(new int[]{1,0}, testObject.plusOne(new int[]{9}));
        Assertions.assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, testObject.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));

    }
}
