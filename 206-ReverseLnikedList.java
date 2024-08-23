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
    public ListNode reverseList(ListNode head) {

        ListNode currNode = head;
        ListNode prev = null;
        ListNode next = null;

        while (currNode != null) {
            
            next = currNode.next;
            currNode.next = prev;
            
            prev = currNode;
            currNode = next;
           
        }
        return prev;

    }
}