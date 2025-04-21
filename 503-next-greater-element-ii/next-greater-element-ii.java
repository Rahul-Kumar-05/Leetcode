class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int res[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){

            int nextmax = -1;

            int j=0;
            while(j < nums.length){
                if(nums[(i+j) % nums.length] > nums[i]){
                    nextmax = nums[(i+j) % nums.length];
                    break;
                }
                j++;
            }
            res[i] = nextmax;
        }

        return res;
    }
}