class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int res = 0;

        for(int i=0; i<nums.length; i++){
            int mask = 0;
            for(int j=i; j<nums.length; j++){

                if((nums[j] & mask) != 0){
                    break;
                }
                else{
                    mask = mask | nums[j];
                    res = Math.max(res, j-i+1);
                }
            }
        }

        return res;
    }
}