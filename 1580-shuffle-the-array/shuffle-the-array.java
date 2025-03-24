class Solution {
    public int[] shuffle(int[] nums, int n) {

        int left[] = new int[n];
        int right[] = new int[n];

        for(int i=0; i<n; i++){
            left[i] = nums[i];
        }
        
        int k = 0;
        for(int i=n; i<nums.length; i++){
            right[k] = nums[i];
            k++;
        }

        int ans[] = new int[2*n];

        int l = 0;
        for(int i=0; i<ans.length; i+=2){
            ans[i] = left[l];
            ans[i+1] = right[l];

            l++;
        }

        return ans;
    }
}