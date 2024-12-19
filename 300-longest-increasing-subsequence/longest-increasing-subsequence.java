class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int dp[][] = new int[n][n+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }

        return helper(0, -1, nums, n, dp);
    }

    public static int helper(int curr, int prev, int arr[], int n, int dp[][]){
        if(curr == n){
            return 0;
        }

        if(dp[curr][prev + 1] != -1){
            return dp[curr][prev + 1];
        }

        int nontake = helper(curr+1, prev, arr, n, dp);
        int take = 0;

        if(prev == -1 || arr[prev] < arr[curr]){
            take = 1 + helper(curr+1, curr, arr, n, dp);
        }
        
        dp[curr][prev + 1] = Math.max(take, nontake);
        return dp[curr][prev + 1];
    }
}