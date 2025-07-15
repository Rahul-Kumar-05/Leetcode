
class Solution {
    public int maxSubArray(int[] arr) {
        int max_sum = arr[0];
        int curr_sum = arr[0];
/*
        for(int i=0; i<arr.length; i++){
            curr_sum = curr_sum + arr[i];

            if (curr_sum > max_sum){
                max_sum = curr_sum;
            }

            if (curr_sum < 0){
                curr_sum = 0;
            }
        }  
*/
 /*       if (max_sum == 0){
            max_sum = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i] > max_sum){
                    max_sum = arr[i];
                }
            }
        }
*/

        for(int i=1; i<arr.length; i++){
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            max_sum = Math.max(curr_sum, max_sum);
        }

        return max_sum;
        
    }
}