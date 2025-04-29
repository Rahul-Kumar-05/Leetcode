class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int n = nums.length-1;

        int max = nums[0];
        for(int i=1; i<=n; i++){
            max = Math.max(max, nums[i]);
        }

        long res = 0;
        int occur = 0;
        int left = 0;

        for(int right=0; right<=n; right++){
            if(nums[right] == max){
                occur++;
            }

            while(occur >= k){
                res = res + (n-right)+1;
                
                if(nums[left] == max){
                    occur--;
                }
                left++;
            }
        }

        return res;
    }
}