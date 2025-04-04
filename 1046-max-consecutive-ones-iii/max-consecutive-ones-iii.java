class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0;
        int right = 0;
        int n = nums.length;

        int ans = 0;

        while(right < n){
            if(nums[right] == 1){
                right++;
            }

            else if(nums[right] == 0 && k>0){
                right++;
                k--;
            }

            else{
                while(k <= 0){
                    if(nums[left] == 0){
                        k++;
                    }
                    left++;
                }
            }

            ans = Math.max(ans, right-left);
        }
        
        return ans;
    }
} 