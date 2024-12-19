class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(check(i, j, s, dp) == true){
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean check(int i, int j, String s, int[][] dp){
        if(i>j){
            return true;
        }

        if(dp[i][j] != -1){
            return (dp[i][j] == 1);
        }

        if(s.charAt(i) == s.charAt(j)){
            boolean result = check(i+1, j-1, s, dp);
            dp[i][j] = result ? 1 : 0;
            return result;
        }

        dp[i][j] = 0;
        return false;
    }
}