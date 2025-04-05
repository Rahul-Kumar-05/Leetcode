class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int index = nums.length-1;
        int c =1;
        int max = nums[index];

        while(index>0){
            index--;
            if(nums[index]!=max){
                c++;
                max = nums[index];
            }

            if(c==3){
                return nums[index];
            }
        }

        return nums[nums.length-1];
    }
}