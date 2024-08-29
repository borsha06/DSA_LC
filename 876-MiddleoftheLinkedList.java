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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode res = head;
        int size = 0;
        int index = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        index = (size / 2);
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;

    }
}