class Solution {
    public static long getpower(long a, long b){
        if(b == 0){
            return 1;
        }

        long half = getpower(a, b/2);
        long res = (half * half) % 1000000007;

        if(b % 2 == 1){
            return (res * a) % 1000000007;
        }

        return res;
    }

    public int countGoodNumbers(long n) {
        
        long res = getpower(5, (n+1)/2)  * getpower(4, n/2);

        res = res % 1000000007;

        return (int)res;
    }
}