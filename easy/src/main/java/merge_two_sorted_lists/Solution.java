package merge_two_sorted_lists;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode one1 = new ListNode(1);
        ListNode one2 = new ListNode(2);
        ListNode one3 = new ListNode(4);
        one1.next = one2;
        one2.next = one3;

        ListNode two1 = new ListNode(1);
        ListNode two2 = new ListNode(3);
        ListNode two3 = new ListNode(4);
        two1.next = two2;
        two2.next = two3;

        ListNode rs = mergeTwoLists(one1, two1);
        while (rs != null) {
            System.out.println(rs.val);
            rs = rs.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = null;
        ListNode end = null;
        ListNode tmp;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmp = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                tmp = new ListNode(l2.val);
                l2 = l2.next;
            }
            if (result == null) {
                result = tmp;
            }
            if (end == null) {
                end = tmp;
            } else {
                end.next = tmp;
                end = tmp;
            }
        }
        if (l1 == null) {
            end.next = l2;
        }
        if (l2 == null) {
            end.next = l1;
        }
        return result;
    }

}
