class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;

        int dp[] = new int[n+1];

        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }

        return robFrom(nums, 0, n-1, dp);
    }

    public static int robFrom(int nums[], int start, int end, int dp[]){
        if(start > end){
            return 0;
        }

        if(dp[start] != -1){
            return dp[start];
        }

        int rob = nums[start] + robFrom(nums, start+2, end, dp);
        int skip = robFrom(nums, start+1, end, dp);

        return dp[start] = Math.max(rob, skip);
    }
}