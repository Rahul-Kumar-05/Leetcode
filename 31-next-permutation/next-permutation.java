class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int golaIdx = -1;

        // step 1 : find gola idx

        for(int i=n-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                golaIdx = i-1;
                break;
            }
        }

        // step 2 : find next greater element and swap with gola idx ele
        if(golaIdx != -1){
            for(int i=n-1; i>golaIdx; i--){
                if(nums[i] > nums[golaIdx]){

                    int temp = nums[i];
                    nums[i] = nums[golaIdx];
                    nums[golaIdx] = temp;

                    break;
                }
            }
        }

        // step 3 : reverse from gola idx+1 to last
        int last = n-1;
        while(golaIdx+1 < last){

            int temp = nums[golaIdx+1];
            nums[golaIdx+1] = nums[last];
            nums[last] = temp;

            golaIdx++;
            last--;
        }
    }
}