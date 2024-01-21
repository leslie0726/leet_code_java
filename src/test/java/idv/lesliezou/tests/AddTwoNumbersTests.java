package idv.lesliezou.tests;

import idv.lesliezou.algorithms.AddTwoNumbers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class AddTwoNumbersTests {

    @Test
    public void testAddTwoNumbersSuccess() {
        AddTwoNumbers testObject = new AddTwoNumbers();
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};
        Assertions.assertArrayEquals(
                AddTwoNumbers.toArray(
                        testObject.addTwoNumbers(AddTwoNumbers.toListNode(l1), AddTwoNumbers.toListNode(l2)))
                , new int[]{7, 0, 8});

        l1 = new int[]{0};
        l2 = new int[]{0};
        Assertions.assertArrayEquals(
                AddTwoNumbers.toArray(
                        testObject.addTwoNumbers(AddTwoNumbers.toListNode(l1), AddTwoNumbers.toListNode(l2)))
                , new int[]{0});

        l1 = new int[]{9,9,9,9,9,9,9};
        l2 = new int[]{9,9,9,9};
        Assertions.assertArrayEquals(
                AddTwoNumbers.toArray(
                        testObject.addTwoNumbers(AddTwoNumbers.toListNode(l1), AddTwoNumbers.toListNode(l2)))
                , new int[]{8,9,9,9,0,0,0,1});

        l1 = new int[]{9,9,1};
        l2 = new int[]{1};
        Assertions.assertArrayEquals(
                AddTwoNumbers.toArray(
                        testObject.addTwoNumbers(AddTwoNumbers.toListNode(l1), AddTwoNumbers.toListNode(l2)))
                , new int[]{0,0,2});

        l1 = new int[]{5};
        l2 = new int[]{5};
        Assertions.assertArrayEquals(
                AddTwoNumbers.toArray(
                        testObject.addTwoNumbers(AddTwoNumbers.toListNode(l1), AddTwoNumbers.toListNode(l2)))
                , new int[]{0,1});

    }

    @Test
    public void testToArray() {
        AddTwoNumbers testObject = new AddTwoNumbers();
        int[] nums = {2, 7, 11, 15};
        Assertions.assertArrayEquals(AddTwoNumbers.toArray(AddTwoNumbers.toListNode(nums)), nums);
    }


}