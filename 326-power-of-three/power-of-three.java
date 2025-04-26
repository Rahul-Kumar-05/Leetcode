class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n == 1) return true;

        if(n < 3) return false;

        int num = n;

        while(num > 1){
            if(num % 3 != 0){
                return false;
            }

            num = num/3;
        }

        return true;
    }
}