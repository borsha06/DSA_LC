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
    public boolean isPalindrome(ListNode head) {

        ListNode curr = head;
        int size = 0;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while (curr != null) {
            arr1.add(curr.val);
            arr2.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(arr2);
        if (arr1.equals(arr2)) {
            return true;
        } else {
            return false;
        }
    }
}