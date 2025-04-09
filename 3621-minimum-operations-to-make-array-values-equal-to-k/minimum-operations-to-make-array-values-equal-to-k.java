class Solution {
    public int minOperations(int[] nums, int k) {
        
        int freq[] = new int[101];

        int same = 0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
            
            if(nums[i] == k){
                same = 1;
            }

            if(nums[i] < k){
                return -1;
            }
        }

        int ans = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                ans++;
            }
        }

        return ans-same;
    }
}