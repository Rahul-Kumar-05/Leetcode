class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }

        int dp[][] = new int[n][(sum/2) + 1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        if(sum%2 == 0){
            return solve(nums, 0, n, sum/2, dp);
        }
        else{
            return false;
        }
    }

    public boolean solve(int arr[], int idx, int n, int target, int dp[][]){
        if(target == 0){
            return true;
        }

        if(target < 0){
            return false;
        }

        if(idx >= n){
            return false;
        }

        if(dp[idx][target] != -1){
            return (dp[idx][target] == 1);
        }

        boolean take = solve(arr, idx+1, n, target - arr[idx], dp);
        boolean nontake = solve(arr, idx+1, n, target, dp);

        boolean res = take || nontake;
        if(res == true){
            dp[idx][target] = 1;
        }
        else{
            dp[idx][target] = 0;
        }
        return res;
    }
}