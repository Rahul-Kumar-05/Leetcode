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
        
        ListNode dummy = new ListNode(10);
        ListNode point = dummy;

        dummy.next = head;

        while(point.next != null && point.next.next != null){

            ListNode temp1 = point.next;
            ListNode temp2 = point.next.next;

            temp1.next = temp2.next;
            temp2.next = temp1;

            point.next = temp2;
            point = temp1;
        }

        return dummy.next;
    }
}