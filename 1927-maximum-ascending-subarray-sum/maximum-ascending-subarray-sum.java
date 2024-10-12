class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int maxsum = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            
            if(nums[i-1] < nums[i]){
                sum = sum + nums[i];
            }

            else{
                // maxsum = Math.max(sum, maxsum);

                if(sum > maxsum){
                    maxsum = sum;
                }
                sum = nums[i];
            }
        }

        if(sum > maxsum){
            maxsum = sum;
        }

        return maxsum;
    }
}