package add_two_numbers;

// * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int t = 0;
        ListNode head = null;
        ListNode cur = null;
        while (l1 != null || l2 != null) {
            System.out.println(l1);
            int v = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + t;
            if (cur == null) {
                cur = new ListNode(v > 9 ? v - 10 : v);
                head = cur;
            } else {
                cur.next = new ListNode(v > 9 ? v - 10 : v);
                cur = cur.next;
            }
            t = v > 9 ? 1 : 0;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (t != 0) {
            cur.next = new ListNode(1);
        }
        return head;
    }
}