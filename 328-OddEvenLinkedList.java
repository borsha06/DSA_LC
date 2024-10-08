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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head == null){
            return head;
        }
        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode evenHead = head.next;
        while(head1.next != null && head2.next != null){

            head1.next = head2.next;
            head1 = head1.next;
            head2.next= head1.next;
            head2 = head2.next;
        }
        head1.next = evenHead;
        return head;
        
    }
}