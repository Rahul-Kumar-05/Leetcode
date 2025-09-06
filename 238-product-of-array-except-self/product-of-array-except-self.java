class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int product2 = 1;
        int count = 0;

        int n = nums.length;

        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            product = product * nums[i];
            

            if(nums[i] == 0){
                count++;
                // continue;
            }
            else{
                product2 = product2 * nums[i];
            }
        }

        if(count >= 2){
            for(int i=0; i<n; i++){
                ans[i] = 0;
            }
        }
        else{
            for(int i=0; i<n; i++){
                if(nums[i] == 0){
                    ans[i] = product2;
                }
                else{
                    ans[i] = product/nums[i];
                }
            }
        }

        return ans;
    }
}