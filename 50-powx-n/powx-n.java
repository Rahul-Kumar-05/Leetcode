class Solution {
    public static double getPower(double a, long b){

        if(b == 0){
            return 1;
        }

        double half = getPower(a, b/2);
        double res = half * half;

        if(b % 2 == 1){
            return a * res;
        }

        return res;
    }



    public double myPow(double x, int n) {
        
        double res = 0;

        if(n >= 0){
            long m = (long)n;
            res = getPower(x, m);
        }
        else{
            long m = -(long)n;

            double r = getPower(x, m);
            res = 1 / r;
        }

        return res;
    }
}