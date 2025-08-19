class Solution {
    public static long count(long n){
        if(n == 1){
            return 1;
        }

        return n + count(n-1);
    }

    public long zeroFilledSubarray(int[] nums) {
        
        long res = 0;

        for(int i=0; i<nums.length; i++){
           
            int no_of_zeroes = 0;

            if(nums[i] == 0){

                while(i < nums.length){
                    if(nums[i] == 0){
                        no_of_zeroes++;
                        i++;
                    }
                    else{
                        break;
                    }
                }
            }

            if(no_of_zeroes > 0){
                res += count(no_of_zeroes);
            }
        }

        return res;
    }
}