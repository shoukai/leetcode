package reverse_linked_list;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode one1 = new ListNode(2);
        ListNode one2 = new ListNode(3);
        ListNode one3 = new ListNode(4);
        ListNode one4 = new ListNode(5);

        head.next = one1;
        one1.next = one2;
        one2.next = one3;
        one3.next = one4;

        ListNode result = reverseList(head);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode point = head.next;
        ListNode last = head;
        ListNode pointNext;
        while (point != null) {
            pointNext = point.next;
            point.next = last;
            last = point;
            point = pointNext;
        }
        head.next = null;
        return last;
    }
}
