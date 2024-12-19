class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int [n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j] = -1;
            }
        }

        int lcs = LCS(word1, word2, n, m, dp);
        int a = n - lcs;
        int b = m - lcs;

        int res = a + b;
        return res;
    }

    public static int LCS(String s1, String s2, int n, int m, int dp[][]){
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