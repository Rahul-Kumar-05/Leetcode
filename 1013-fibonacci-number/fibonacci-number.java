class Solution {
    public int fib(int n) {
        
        // int dp[] = new int[n+1];
        // for(int i=0; i<dp.length; i++){
        //     dp[i] = -1;
        // }

        // return helper(n, dp);


        // Tabulation approach

        if(n==1 || n==0){
            return n;
        }
        
        int dp[] = new int [n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public int helper(int n, int dp[]){
        if(n==1 || n==0){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fib(n-1) + fib(n-2);
    }
}