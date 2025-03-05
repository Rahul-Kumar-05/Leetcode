class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefixSum = 0;
        int suffixSum = 0;

        for(int i=nums.length-1; i>=0; i--){
            suffixSum = suffixSum + nums[i];
        }

        int res = -1;

        for(int i=0; i<nums.length; i++){
            suffixSum = suffixSum - nums[i];

            if(prefixSum == suffixSum){
                res = i;
                break;
            }

            prefixSum = prefixSum + nums[i]; 
        }

        return res;
    }
}