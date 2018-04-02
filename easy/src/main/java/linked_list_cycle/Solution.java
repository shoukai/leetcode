package linked_list_cycle;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(1);
        ListNode a5 = new ListNode(1);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a1;

        System.out.println(hasCycle(a1));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (true) {
            if (p1 == null || p2 == null) {
                return false;
            }
            if (p1.next != null) {
                p1 = p1.next;
            } else {
                return false;
            }
            if (p2.next != null) {
                p2 = p2.next;
            } else {
                return false;
            }
            if (p2.next != null) {
                p2 = p2.next;
            } else {
                return false;
            }
            if (p1.hashCode() == p2.hashCode()) {
                return true;
            }
        }

    }

}
