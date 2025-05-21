class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int n = g.length;
        int m = s.length;

        int count = 0;
        // int k = 0;

        // for(int i=0; i<m; i++){
            
        //     if(i >= n || k >= m){
        //         break;
        //     }

        //     while((k < m-1) && (s[k] < g[i])){
        //         k++;
        //     }

        //     if(g[i] <= s[k]){
        //         count++;
        //         k++;
        //     }

        // }
        int child = 0;
        int candies = 0;

        while(child < n && candies < m){
            if(s[candies] >= g[child]){
                child++;
                count++;
            }

            candies++;
        }

        return count;
    }
}