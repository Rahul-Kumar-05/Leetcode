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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        ListNode newHead = head;
        ListNode temp = head;

        while(temp != null){
            if(set.contains(temp.val)){
                temp = temp.next;
            }
            else{
                newHead = temp;
                break;
            }
        }

        while(temp != null){
            ListNode t = temp.next;

            while(t != null && set.contains(t.val)){
                t = t.next;
            }

            temp.next = t;
            temp = t;
        }

        return newHead;
    }
}