class Solution {
    public int[] sumZero(int n) {
        
        int mid = 0;
        int half = n/2;

        if(n%2 != 0){
            mid = 1;
        }

        int res[] = new int[n];

        int val = half;

        int i = 0;
        while(i<half){
            res[i] = val;
            i++;
            val--;
        }

        if(mid == 1){
            res[i] = 0;
            i++;
        }

        val = -1;
        while(i<n){
            res[i] = val;
            i++;
            val--;
        }

        return res;
    }
}