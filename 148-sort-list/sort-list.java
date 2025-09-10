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
    public static int size(ListNode head){

        int size = 0;
        
        while(head != null){
            size++;
            head = head.next;
        }

        return size;
    }

    public ListNode sortList(ListNode head) {
        
        int n = size(head);
        ListNode t = head;

        int temp[] = new int[n];

        for(int i=0; i<n; i++){
            temp[i] = t.val;
            t = t.next;
        }

        Arrays.sort(temp);

        t = head;

        for(int i=0; i<n; i++){
            t.val = temp[i];
            t = t.next;
        }

        return head;
    }
}