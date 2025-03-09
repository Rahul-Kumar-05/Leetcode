class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        
        int n = colors.length;
        int ans = 0; 

        for(int i=0; i<n; i++){

            int left = colors[(i-1+n) % n];
            int middle = colors[i];
            int right = colors[(i+1) % n];
            
            if(middle != left && middle != right){
                ans++;
            }
        }

        return ans;
    }
}