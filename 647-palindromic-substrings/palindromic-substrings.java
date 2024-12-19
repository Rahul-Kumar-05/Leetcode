class Solution {
    public int countSubstrings(String s) {

        // Memonization 
        // int n = s.length();

        // int dp[][] = new int[n+1][n+1];
        // for(int i=0; i<dp.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // int count = 0;

        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(check(i, j, s, dp) == true){
        //             count++;
        //         }
        //     }
        // }
        // return count;


        // ------------------------------------------------------------

        // Tabulation 
        int n = s.length();
        int count = 0;

        boolean dp[][] = new boolean[n][n];

        for(int l=1; l<=n; l++){
            for(int i=0; i+l-1<n; i++){
                int j = i+l-1;

                if(i == j){
                    dp[i][j] = true;
                }
                else if(i+1 == j){
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }
                else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }

                if(dp[i][j]){
                    count++;
                }
            }
        }

        return count;
    }

    // public static boolean check(int i, int j, String s, int dp[][]){
    //     if(i > j){
    //         return true;
    //     }

    //     if(dp[i][j] != -1){
    //         return (dp[i][j] == 1);
    //     }

    //     if(s.charAt(i) == s.charAt(j)){
    //         boolean result = check(i+1, j-1, s, dp);
    //         dp[i][j] = result ? 1 : 0;
    //         return result;
    //     }

    //     dp[i][j] = 0;
    //     return false;
    // }
}