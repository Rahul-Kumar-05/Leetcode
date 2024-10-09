class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] > max){
                sec_max = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i] > sec_max){
                sec_max = nums[i];
            }
        }

        if(sec_max*2 <= max){
            return index;
        }
        else{
            return -1;
        }
    }
}