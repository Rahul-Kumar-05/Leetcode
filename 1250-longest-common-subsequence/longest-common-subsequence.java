class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        // int dp[][] = new int [n+1][m+1];
        // for(int i=0; i<=n; i++){
        //     for(int j=0; j<=m; j++){
        //         dp[i][j] = -1;
        //     }
        // }

        // return lcsHelper(text1, text2, n, m, dp);



        //   Tabulation

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<=m; i++){
            dp[0][i] = 0;
        }

        for(int i=0; i<=n; i++){
            dp[i][0] = 0;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }

            }
        }

        return dp[n][m];
    }

    public static int lcsHelper(String s1, String s2, int n, int m, int dp[][]){
        
        if(n == 0 || m == 0){
            return 0;
        }
        
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        
        int take = 0;
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            take = 1 + lcsHelper(s1, s2, n-1, m-1, dp);
        }
        else{
            take = Math.max(lcsHelper(s1, s2, n-1, m, dp), lcsHelper(s1, s2, n, m-1, dp));
        }
        
        dp[n][m] = take;
        return take;
    }

    // public static int LCS(String s1, String s2, int n, int m, int dp[][]){
    //     if(n == 0 || m == 0){
    //         return 0;
    //     }

    //     if(dp[n][m] != -1){
    //         return dp[n][m];
    //     }

    //     if(s1.charAt(n-1) == s2.charAt(m-1)){
    //         dp[n][m] = 1 + LCS(s1, s2, n-1, m-1, dp); 
    //     }

    //     else{
    //         dp[n][m] = Math.max(LCS(s1, s2, n-1, m, dp), LCS(s1, s2, n, m-1, dp));
    //     }

    //     return dp[n][m];
    // }
}