class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int res[] = new int[nums.length];

        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        int left = 0;
        int right = sum;

        for(int i=0; i<nums.length; i++){
            right -= nums[i];

            res[i] = Math.abs(left - right);

            left += nums[i];
        }

        return res;
    }
}