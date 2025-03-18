class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int n = nums.length;
        int mask = 0;
        int res = 1;

        int i = 0; 
        int j = 0;

        while(j < n){

            while((nums[j] & mask) != 0){
                mask = (mask ^ nums[i]);
                i++;
            }

            mask = (mask | nums[j]);
            res = Math.max(res, j-i+1);
            j++;
        }

        // for(int i=0; i<nums.length; i++){
        //     int mask = 0;
        //     for(int j=i; j<nums.length; j++){

        //         if((nums[j] & mask) != 0){
        //             break;
        //         }
        //         else{
        //             mask = mask | nums[j];
        //             res = Math.max(res, j-i+1);
        //         }
        //     }
        // }

        return res;
    }
}