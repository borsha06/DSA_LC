/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode zero = head;
        ListNode curr = head.next;

        ListNode sum = new ListNode();
        int s = 0;

        while(curr != null){
            if(curr.val != 0){
                s += curr.val;
            }
            else {
                sum = new ListNode(s);
                zero.next = sum;
                s = 0;
                zero = zero.next;
            }
            curr = curr.next;
        }
        return head.next;
    }
}