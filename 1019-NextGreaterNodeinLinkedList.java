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
    public int[] nextLargerNodes(ListNode head) {

        ListNode curr = head;
        List<Integer> values = new ArrayList<>();

        while (curr != null) {
            int value = curr.val;
            int c = 0;
            ListNode curr1 = curr.next;
            while (curr1 != null) {
                if (curr1.val > value) {
                    values.add(curr1.val);
                    c++;
                    break;
                }
                curr1 = curr1.next;
            }
            if (c == 0) {
                values.add(0);
            }
            curr = curr.next;
        }
        int[] arr = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            arr[i] = values.get(i);
        }
        return arr;

    }
}