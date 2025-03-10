class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        int total = 0;

        for(int i=0; i<n; i++){
            total = total + nums[i];
            
            currsum = currsum + nums[i];            
            if(currsum > maxsum){
                maxsum = currsum;
            }

            if(currsum < 0){
                currsum = 0;
            }
        }

        int minsum = Integer.MAX_VALUE;
        int curr = 0;

        for(int i=0; i<n; i++){

            curr = curr + nums[i];

            if(curr < minsum){
                minsum = curr;
            }

            if(curr > 0){
                curr = 0; 
            }
        }

        if(maxsum < 0){
            return maxsum;
        }

        int res = Math.max(maxsum, (total - minsum));
        return res;
    }
}