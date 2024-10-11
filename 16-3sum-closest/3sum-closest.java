class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);

        int closest = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0; i<nums.length-2; i++){

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }

                if(Math.abs(target-sum) < closest){
                    closest = Math.abs(target - sum);
                    ans = sum;
                }
            }
        }

        return ans;
    }
}