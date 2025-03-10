
class Solution {
    public int maxSubArray(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0; i<arr.length; i++){
            curr_sum = curr_sum + arr[i];

            if (curr_sum < 0){
                curr_sum = 0;
            }

            if (curr_sum > max_sum){
                max_sum = curr_sum;
            }
        }  

        if (max_sum == 0){
            max_sum = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i] > max_sum){
                    max_sum = arr[i];
                }
            }
        }
        return max_sum;
        
    }
}