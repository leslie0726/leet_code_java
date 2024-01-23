package idv.lesliezou.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for (int i : nums1) {
            result.add(i);
        }
        for (int i : nums2) {
            result.add(i);
        }
        Collections.sort(result);
        if (result.size() % 2 == 0) {
            return (result.get(result.size() / 2) + result.get(result.size() / 2 - 1)) / 2.0;
        } else {
            return result.get(result.size() / 2);
        }
    }
}
