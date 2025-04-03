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

    public static int length(ListNode head){
        int len = 0;

        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {
        

        if(head == null || head.next == null ){
            return head;
        }

        int len = length(head);

        k = k%len;

        if(k < 1){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i=1; i<=k; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode t = slow.next;
        slow.next = null;
        fast.next = head;

        return t;    
    }
}