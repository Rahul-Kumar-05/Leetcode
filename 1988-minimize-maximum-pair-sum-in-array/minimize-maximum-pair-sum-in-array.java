class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length-1;
        

        int res = 0;

        while(start < end){
            int temp = nums[start] + nums[end];
            res = Math.max(res, temp);

            start++;
            end--;
        }

        return res;
    }
}