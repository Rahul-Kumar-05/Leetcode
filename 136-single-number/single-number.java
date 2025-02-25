class Solution {
    public int singleNumber(int[] nums) {
    
        int res = 0;
        for(int i=0; i<nums.length; i++){
            
            int curr = nums[i];
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == curr){
                    count++;
                }
            }

            if(count == 1){
                res = nums[i];
            }
        }

        return res;
    }
}