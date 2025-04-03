class Solution {
    public long maximumTripletValue(int[] nums) {
        
        int n = nums.length;

        int premax[] = new int[n];
        premax[0] = nums[0];

        for(int i=1; i<n; i++){
            premax[i] = Math.max(nums[i], premax[i-1]);
        }

        int sufmax[] = new int[n];
        sufmax[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            sufmax[i] = Math.max(nums[i], sufmax[i+1]);
        }

        long res = 0;
        for(int i=1; i<n-1; i++){
            long left = premax[i-1];
            long right = sufmax[i+1];

            if(left > nums[i]){
                res = Math.max(res, (left - nums[i])*right);
            }
        }

        return res;
    }
}