class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int n = nums.length;

        int minsum = Integer.MAX_VALUE;
        int curr = 0;

        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        int total = 0;

        for(int i=0; i<n; i++){
            // total sum
            total = total + nums[i];
            
            // maxsum
            currsum = currsum + nums[i];            
            if(currsum > maxsum){
                maxsum = currsum;
            }

            if(currsum < 0){
                currsum = 0;
            }

            // min sum
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