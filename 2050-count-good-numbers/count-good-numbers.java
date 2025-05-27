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
        
        long even = (n+1)/2;
        long odd = n/2;

        long res = getpower(5, even)  * getpower(4, odd);

        res = res % 1000000007;

        return (int)res;
    }
}