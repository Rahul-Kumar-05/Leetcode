class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();

        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }

        return LCS(s, sb, n, n, dp);
    }

    public static int LCS(String s1, StringBuilder s2, int n, int m, int dp[][]){
        if(n == 0 || m == 0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = 1 + LCS(s1, s2, n-1, m-1, dp);
        }
        else{
            dp[n][m] = Math.max(LCS(s1, s2, n-1, m, dp), LCS(s1, s2, n, m-1, dp));
        }

        return dp[n][m];
    }
}