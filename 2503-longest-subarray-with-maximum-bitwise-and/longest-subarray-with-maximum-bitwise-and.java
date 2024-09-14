class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int max = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int count = 0;
        int res = 0;
        int i = 0;
        while(i < n){
            if(nums[i] == max){
                count++;
                if(count > res){
                    res = count;
                }
                i++;
            }
            else{
                count = 0;
                i++;
            }
        }
        return res;
    }
}