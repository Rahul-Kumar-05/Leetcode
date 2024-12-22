class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int  n = nums.length;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }        

        int dp[][] = new int[n][2*sum + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        return helper(nums, target, 0, 0, sum, dp);
    }

    public int helper(int nums[], int target, int idx, int currsum, int sum, int dp[][]){
        
        if(idx == nums.length){
            if(target == currsum){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(dp[idx][sum + currsum] != -1){
            return dp[idx][sum + currsum];
        }

        int addcase = helper(nums, target, idx+1, currsum + nums[idx], sum, dp);
        int minuscase = helper(nums, target, idx+1, currsum - nums[idx], sum, dp);

        return dp[idx][sum + currsum] = addcase + minuscase;
    }
}