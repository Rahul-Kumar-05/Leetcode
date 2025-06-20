class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }

        long left = 0;
        long right = sum;
        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            left = left + nums[i];
            right = right - nums[i];

            if(left >= right){
                count++;
            }
        }

        return count;
    }
}