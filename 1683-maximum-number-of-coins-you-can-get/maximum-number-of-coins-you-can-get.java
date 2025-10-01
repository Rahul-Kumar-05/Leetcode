class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);

        int res = 0;

        int l = 0;
        int r = piles.length - 2;

        while(l < r){
            res += piles[r];
            r -= 2;
            l++;
        }
        
        return res;
    }
}