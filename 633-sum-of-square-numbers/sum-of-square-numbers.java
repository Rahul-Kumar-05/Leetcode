class Solution {
    public boolean judgeSquareSum(int c) {
        

        long start = 0;
        long end = (int)Math.sqrt(c);

        while(start <= end){

            long res = (start * start) + (end * end);

            if(res == c){
                return true;
            }

            else if( res > c){
                end = end-1;
            }
            else{
                start = start + 1;
            }
        }

        return false;
    }
}