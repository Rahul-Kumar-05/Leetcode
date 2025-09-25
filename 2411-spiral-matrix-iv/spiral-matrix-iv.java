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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int res[][] = new int[m][n];

        ListNode temp = head;

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(left <= right && top <= bottom && temp != null){

            // from left to right
            for(int i=left; i<=right && temp != null; i++){
                
                if(temp.val == 0){
                    res[top][i] = -2;
                }
                else{
                    res[top][i] = temp.val;
                }

                temp = temp.next;
            }
            top++;

            // from top to bottom
            for(int i=top; i<=bottom && temp != null; i++){

                if(temp.val == 0){
                    res[i][right] = -2;
                }
                else{
                    res[i][right] = temp.val;
                }
                
                temp = temp.next;
            }
            right--;

            // from right to left 
            if(top <= bottom){
                for(int i=right; i>=left && temp != null; i--){
                    
                    if(temp.val == 0){
                        res[bottom][i] = -2;
                    }
                    else{
                        res[bottom][i] = temp.val;
                    }
                    temp = temp.next;
                }
                bottom--;
            }

            // from bottom to top
            if(left <= right){
                for(int i=bottom; i>=top && temp != null; i--){

                    if(temp.val == 0){
                        res[i][left] = -2;
                    }
                    else{
                        res[i][left] = temp.val;
                    }
                    temp = temp.next;
                }
                left++;
            }
        }

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[i].length; j++){

                if(res[i][j] == 0){
                    res[i][j] = -1;
                }

                else if(res[i][j] == -2){
                    res[i][j] = 0;
                }
            }
        }

        return res;
    }
}