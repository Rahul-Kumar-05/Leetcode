class Solution {

    public static int helper(String s1, String s2, int n, int m, int dp[][]){
        if(n == 0){
            return m;
        }
        else if(m == 0){
            return n;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = helper(s1, s2, n-1, m-1, dp);
        }
        else{
            int insert = 1 + helper(s1, s2, n, m-1, dp);
            int delete = 1 + helper(s1, s2, n-1, m, dp);
            int replace = 1 + helper(s1, s2, n-1, m-1, dp);

            dp[n][m] = Math.min(insert, Math.min(delete, replace));
        }
        return dp[n][m];
    }

    public int minDistance(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){

                dp[i][j] = -1;
            }
        }

        return helper(word1, word2, n, m, dp);
    }
}