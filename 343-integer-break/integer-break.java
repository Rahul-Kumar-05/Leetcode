class Solution {
    public int integerBreak(int n) {
        if(n<=3){
            return n-1;
        }

        double ans = 1;

        int count_of_3 = n/3;

        if(n%3 == 0){
            ans = Math.pow(3, count_of_3);
        }
        else if(n%3 == 1){
            ans = Math.pow(3, count_of_3 -1) * 4;
        }
        else{
            ans = Math.pow(3, count_of_3) * 2;
        }

        return (int) ans;
    }
}