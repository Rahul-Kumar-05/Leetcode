class Solution {
    public int numOfSubarrays(int[] arr) {

        final int mod = 1000000007;

        int odd = 0;
        int even = 1;
        int pref = 0;
        int res = 0;

        for(int num : arr){
            pref += num;

            if(pref % 2 == 0){
                res = (res + odd) % mod;
                even++; 
            }

            else{
                res = (res + even) % mod;
                odd++;
            }
        }

        return res;
    }
}