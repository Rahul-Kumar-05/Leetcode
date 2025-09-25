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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode slow = list1;
        ListNode fast = list1;

        for(int i=1; i<a; i++){
            slow = slow.next;
        }

        for(int i=0; i<b+1; i++){
            fast = fast.next;
        }

        slow.next = list2;
    
        while(slow.next != null){
            slow = slow.next;
        }

        slow.next = fast;

        return list1;
    }
}