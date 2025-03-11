class Solution {
    public int maxScore(int[] cardPoints, int k) {

        /*  Mam ka approach   */


        int lsum = 0;
        int rsum = 0;

        int ans = 0;

        for(int i=0; i<k; i++){
            lsum = lsum + cardPoints[i];
        }
        ans = lsum;

        int n = cardPoints.length - 1;
        for(int i=k-1; i>=0; i--){
            rsum = rsum + cardPoints[n];
            lsum = lsum - cardPoints[i];
            n--;

            ans = Math.max(ans, lsum + rsum); 
        }

        return ans;   
    }
}