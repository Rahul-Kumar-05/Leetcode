class Solution {
    public boolean check(int[] nums) {
        int callBreak = 0;
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                callBreak++;
            }
        }

        if(nums[n-1] > nums[0]){
            callBreak++;
        }

        if(callBreak <= 1){
            return true;
        }
        else{
            return false;
        }
    }
}