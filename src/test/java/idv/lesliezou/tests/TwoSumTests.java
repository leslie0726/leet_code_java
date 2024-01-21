package idv.lesliezou.tests;

import idv.lesliezou.algorithms.TwoSum;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TwoSumTests {

    @Test
    public void testTwoSumSuccess() {
        TwoSum testObject = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        Assertions.assertArrayEquals(new int[]{0, 1}, testObject.twoSum(nums, 9));
        nums = new int[]{3, 2, 4};
        Assertions.assertArrayEquals(new int[]{1, 2}, testObject.twoSum(nums, 6));
        nums = new int[]{3, 3};
        Assertions.assertArrayEquals(new int[]{0, 1}, testObject.twoSum(nums, 6));
    }

    @Test
    public void testTwoSumEmpty() {
        TwoSum testObject = new TwoSum();
        int[] nums = {3, 2, 4};
        Assertions.assertArrayEquals(new int[]{1, 2}, testObject.twoSum(nums, 6));
    }


}