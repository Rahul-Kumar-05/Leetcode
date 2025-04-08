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
    public ListNode doubleIt(ListNode head) {
        
        ListNode temp = head;

        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        temp = head;
        int arr[] = new int[size+1];

        for(int i=1; i<arr.length; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }

        int carry = 0;
        for(int i=arr.length-1; i>=0; i--){
            int digit = arr[i] * 2 + carry;

            arr[i] = digit % 10;
            carry = 0;

            if(digit > 9){
                carry = digit / 10;
            }

        }

        ListNode t = new ListNode(0);
        ListNode head1 = t;

        if(arr[0] != 0){
            t.next = new ListNode(arr[0]);
            t = t.next;
        }

        for(int i=1; i<arr.length; i++){
            t.next = new ListNode(arr[i]);
            t = t.next;
        }

        return head1.next;
    }
}