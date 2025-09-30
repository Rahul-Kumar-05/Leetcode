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
    public ListNode removeNodes(ListNode head) {
        
        ListNode temp = head;
        int length = 0;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        int nums[] = new int[length];

        temp = head;

        int j=0;
        while(temp != null){
            nums[j] = temp.val;
            j++;
            temp = temp.next;
        }

        Stack<Integer> st = new Stack<>();

        for(int i=length-1; i>=0; i--){
           
            if(st.isEmpty() || nums[i] >= st.peek()){
                st.push(nums[i]);
            }
        }

        ListNode res = new ListNode(0);
        temp = res;

        while(!st.isEmpty()){
            ListNode node = new ListNode(st.pop());
            temp.next = node;
            temp = temp.next;
        }

        return res.next;
    }
}