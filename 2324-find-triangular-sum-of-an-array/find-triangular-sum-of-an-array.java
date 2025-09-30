class Solution {
    public int triangularSum(int[] nums) {
        
        int res = 0;
        int r = nums.length-1;

        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-1; j++){

                if(nums[j+1] == -1){
                    break;
                }
                
                nums[j] = (nums[j] + nums[j+1]) % 10;
            }
            nums[r] = -1;
            r--;
        }

        return nums[0];
    }
}