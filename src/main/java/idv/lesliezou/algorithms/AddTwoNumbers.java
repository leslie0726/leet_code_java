package idv.lesliezou.algorithms;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Value = l1 != null ? l1.val : 0;
            int l2Value = l2 != null ? l2.val : 0;

            ListNode newNode = new ListNode((l1Value + l2Value + carry) % 10);
            carry = (l1Value + l2Value + carry) / 10;

            tail.next = newNode;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            tail = tail.next;
        }
        return dummyHead.next;
    }

    public static ListNode toListNode(int[] nums) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        for (int num : nums) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }
        return dummyHead.next;
    }

    public static int[] toArray(ListNode listNode) {
        List resultList = new ArrayList<>();
        while (true) {
            if (listNode != null) {
                resultList.add(listNode.val);
                listNode = listNode.next;
            } else {
                break;
            }
        }
        return resultList.stream().mapToInt(i -> (int) i).toArray();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}