class Solution {
    public boolean isPowerOfFour(int n) {
        
        int rem = 4;

        if(n == 1) return true;

        if(n < 4){
            return false;
        }

        while(n >= 4){
            if(n % 4 == 0){
                n = n / 4;
            }
            else{
                return false;
            }

            if(n == 1) return true;
        }

        return false;
    }
}