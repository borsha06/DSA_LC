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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list1;

        for (int i = 0; i < a - 1; i++) {
            curr1 = curr1.next;
        }
        for (int i = 0; i < b - 1; i++) {
            curr2 = curr2.next;
        }
        ListNode next1 = curr2.next;
        while (list2 != null) {
            curr1.next = list2;
            list2 = list2.next;
            curr1 = curr1.next;
        }
        curr1.next = next1.next;
        return list1;
    }
}