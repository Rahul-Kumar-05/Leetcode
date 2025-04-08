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

    public static ListNode reverse(ListNode head){
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        
        ListNode thead = reverse(head);
        ListNode t = thead;

        int carry = 0;
        while(t != null){
            int num = (t.val * 2) + carry;

            int digit = num % 10;
            t.val = digit;

            carry = num / 10;

            t = t.next;
        }

        t = thead;

        while(t.next != null){
            t = t.next;
        }

        if(carry > 0){
            t.next = new ListNode(carry);
            t = t.next;
        }

        ListNode res = reverse(thead);

        return res;
    }
}