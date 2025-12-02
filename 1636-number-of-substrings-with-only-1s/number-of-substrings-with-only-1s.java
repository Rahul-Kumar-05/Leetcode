class Solution {

    public static long solve(long n){
        return ((n+1)*n)/2;
    }

    public int numSub(String s) {
        
        long mod = 1000000007;

        long res = 0;

        for(int i=0; i<s.length(); i++){
            long count = 0;
            
            if(s.charAt(i) == '1'){
                count++;
                
                while(i<s.length()-1 && s.charAt(i+1) == '1'){
                    count++;
                    i++;
                }
            }

            res += solve(count) % mod;
        }

        return (int)(res % mod);
    }
}