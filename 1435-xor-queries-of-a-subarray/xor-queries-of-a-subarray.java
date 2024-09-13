class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = arr.length;
        int qs = queries.length;

        int prefxor[] = new int[n];
        prefxor[0] = arr[0];

        for(int i=1; i<n; i++){
            prefxor[i] = prefxor[i-1] ^ arr[i];
        }

        int ans[] = new int[qs];

        for(int i=0; i<qs; i++){
            int l = queries[i][0];
            int r = queries[i][1];

            if(l == 0){
                ans[i] = prefxor[r];
            }
            else{
                ans[i] = prefxor[r] ^ prefxor[l-1];
            }
        }
        return ans;
    }
}