package remove_nth_node_from_end_of_list;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        // Given linked list: 1->2->3->4->5, and n = 2.
        ListNode one1 = new ListNode(1);
        ListNode one2 = new ListNode(2);
        ListNode one3 = new ListNode(3);
        ListNode one4 = new ListNode(4);
        ListNode one5 = new ListNode(5);
        one1.next = one2;
        one2.next = one3;
        one3.next = one4;
        one4.next = one5;

        ListNode result = removeNthFromEnd(one1, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

        System.out.println("--");

        ListNode two1 = new ListNode(1);

        result = removeNthFromEnd(two1, 1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

        System.out.println("--");

        ListNode three1 = new ListNode(1);
        ListNode three2 = new ListNode(2);

        three1.next = three2;

        result = removeNthFromEnd(three1, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode point = head;
        while (point != null) {
            count++;
            point = point.next;
        }
        int serial = count - n;
        point = head;
        while (point != null) {
            serial--;
            if (serial == 0) {
                if (point.next != null) {
                    ListNode tmp = point.next;
                    point.next = tmp.next;
                    break;
                }
            } else if (serial < 0) {
                return point.next;
            }
            point = point.next;
        }
        return head;
    }
}
