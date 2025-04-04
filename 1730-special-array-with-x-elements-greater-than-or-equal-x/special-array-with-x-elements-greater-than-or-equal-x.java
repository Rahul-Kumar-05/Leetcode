class Solution {
    public int specialArray(int[] nums) {
        
        int n = nums.length;

        int arr[] = new int[n+1];

        for(int i=0; i<n; i++){
            if(nums[i] < n){
                arr[nums[i]]++;
            }
            else{
                arr[n]++;
            }
        }

        // for(int i : nums){
        //     arr[Math.min(i, n)]++; 
        // }
        

        int total = 0;
        for(int i=n; i>=0; i--){
            total = total + arr[i];

            if(total == i){
                return total;
            }
        }

        return -1;
    }
}