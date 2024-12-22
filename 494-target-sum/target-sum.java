class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return helper(nums, target, 0, 0);
    }

    public int helper(int nums[], int target, int idx, int currsum){
        
        if(idx == nums.length){
            if(target == currsum){
                return 1;
            }
            else{
                return 0;
            }
        }

        int addcase = helper(nums, target, idx+1, currsum + nums[idx]);
        int minuscase = helper(nums, target, idx+1, currsum - nums[idx]);

        return addcase + minuscase;
    }
}