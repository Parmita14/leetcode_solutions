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

    public ListNode swapPairs(ListNode head) {
  for (ListNode curr = head; curr != null && curr.next != null; curr = curr.next) {
      int temp = curr.next.val;
      curr.next.val = curr.val;
      curr.val = temp;
      curr = curr.next;
  }
  return head;
}
}
