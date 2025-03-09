class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        
        int n = colors.length;
        int ans = 0;
        int maxlen = 1;

        for(int i=1; i<=(n-1)+(k-1); i++){

            if(colors[i%n] != colors[(i-1+n)%n]){
                maxlen++;
            }
            else{
                maxlen = 1;
            }

            if(maxlen >= k){
                ans++;
            }
        }

        return ans;
    }
}