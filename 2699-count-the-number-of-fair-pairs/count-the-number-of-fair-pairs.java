class Solution {
    public static long countAtmost(int nums[], int val){

        int i = 0; 
        int j = nums.length-1;

        long count = 0;

        while(i < j){
            if(nums[i] + nums[j] > val){
                j--;
            }
            else{
                count += j-i;
                i++;
            }
        }

        // for(int i=0; i<j; i++){
        //     while(i<j && nums[i] + nums[j] > val){
        //         j--;
        //     }
        //     count += j-i;
        // }

        return count;
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        long res = countAtmost(nums, upper) - countAtmost(nums, lower-1);

        return res;
    }
}