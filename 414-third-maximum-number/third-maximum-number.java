class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int index = nums.length-1;
        int c =1;

       for(int i=nums.length-1; i>0; i--){
             if(nums[i]!= nums[i-1]){
                c++;

                if(c==3){
                    return nums[i-1];
                }
             }
       }

        return nums[nums.length-1];
    }
}