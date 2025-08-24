class Solution {
    public int longestSubarray(int[] nums) {
        
        int count = 0;
        int temp = 0;
        int zero = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
                int l = i-1;
                int r = i+1;

                while(l >= 0){
                    if(nums[l] == 0){
                        break;
                    }
                    temp++;
                    l--;
                }
                while(r < nums.length){
                    if(nums[r] == 0){
                        break;
                    }
                    temp++;
                    r++;
                }

                count = Math.max(count, temp);
                temp = 0;
            }
            
        }

        if(zero == 0){
            return nums.length-1;
        }

        return count;
    }
}