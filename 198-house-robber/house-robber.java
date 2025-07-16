class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;

        int dp[] = new int[n+1];

        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }

        return robFrom(nums, n-1, dp);
    }

    public static int robFrom(int nums[], int i, int dp[]){
        if(i < 0){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int rob = nums[i] + robFrom(nums, i-2, dp);
        int skip = robFrom(nums, i-1, dp);

        return dp[i] = Math.max(rob, skip);
    }
}