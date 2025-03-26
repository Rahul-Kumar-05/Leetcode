class Solution {
    public int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;

        while (low < high){

            int mid = low + (high - low)/2;
            
            //3 3 1 3 and 2 2 2 2 2 handeling these test case here
            if(nums[mid] == nums[low] && nums[mid] == nums[high]){
                low++;
                high--;
            }

            else if(nums[mid] > nums[high]){
                low = mid + 1;
            }

            else{
                high = mid;
            }
        }

        return nums[low];
    }
}