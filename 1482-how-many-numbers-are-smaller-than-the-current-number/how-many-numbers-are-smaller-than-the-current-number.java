class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int res[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            
            int count = 0;
            int temp = nums[i];
            for(int j=0; j<nums.length; j++){
                if(nums[j] < temp){
                    count++;
                }
            }
            res[i] = count;
        }

        return res;
    }
}