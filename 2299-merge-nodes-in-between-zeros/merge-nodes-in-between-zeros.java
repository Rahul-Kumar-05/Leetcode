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
    public ListNode mergeNodes(ListNode head) {

        ListNode temp = head;
        int sum = 0;

        ListNode res = new ListNode(0);
        ListNode h = res;

        temp = temp.next;

        while(temp != null){
            if(temp.val == 0){
                ListNode newNode = new ListNode(sum);
                res.next = newNode;
                res = res.next;
                sum = 0;
            }
            else{
                sum += temp.val;
            }

            temp = temp.next;
        }

        return h.next;
    }
}