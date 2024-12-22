class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
        int dp[][][] = new int[m+1][n+1][strs.length];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                for(int k=0; k<dp[0][0].length; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        
        return helper(strs, m, n, 0, dp);
    }

    public static int countzero(String s){
        int n = s.length();
        int count = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                count++;
            }
        }

        return count;
    }

    public static int helper(String[] s, int m, int n, int idx, int dp[][][]){

        if(idx >= s.length){
            return 0;
        }

        if(dp[m][n][idx] != -1){
            return dp[m][n][idx];
        }

        int count_zero = countzero(s[idx]);
        int count_one = s[idx].length() - count_zero;

        int nontake = helper(s, m, n, idx+1, dp);
        int take = Integer.MIN_VALUE;

        if(count_zero <= m && count_one <= n){
            take = 1 + helper(s, m-count_zero, n-count_one, idx+1, dp);
        }

        return dp[m][n][idx] = Math.max(take, nontake);
    }
}