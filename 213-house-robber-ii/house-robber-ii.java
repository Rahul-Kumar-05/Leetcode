class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(nums.length == 1) return nums[0];

        if(nums.length < 1) return 0;

        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int start_1st = robber(nums, 0, n-2, dp1);
        int start_2nd = robber(nums, 1, n-1, dp2);

        return Math.max(start_1st, start_2nd);
    }

    public static int robber(int nums[], int start, int end, int dp[]){
        if(start > end){
            return 0;
        }
        if(dp[start] != -1) return dp[start];

        int rob = nums[start] + robber(nums, start+2, end, dp);
        int skip = robber(nums, start+1, end, dp);

        return dp[start] = Math.max(rob, skip);
    }
}