package idv.lesliezou.tests;

import idv.lesliezou.algorithms.MedianOfTwoSortedArrays;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class MedianOfTwoSortedArraysTests {

    @Test
    public void testMedianOfTwoSortedArraysSuccess() {
        MedianOfTwoSortedArrays testObject = new MedianOfTwoSortedArrays();
        int[] input1 = new int[]{1, 3};
        int[] input2 = new int[]{2};
        Assertions.assertEquals(testObject.findMedianSortedArrays(input1, input2), 2.0);
        input1 = new int[]{1,2};
        input2 = new int[]{3,4};
        Assertions.assertEquals(testObject.findMedianSortedArrays(input1, input2), 2.5);
    }


}