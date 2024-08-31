/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int currVal = curr.val;
            int nextVal = curr.next.val;
            int gcdV = gcd(currVal, nextVal);
            ListNode newNode = new ListNode(gcdV);
            newNode.next = curr.next;
            curr.next = newNode;

            curr = curr.next.next;

        }
        return head;

    }

    public int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}