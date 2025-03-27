class Solution {
    public int search(int[] nums, int target) {
        
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
        // }
        // return -1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                return mid;
            }

            // if left half is sorted
            else if(nums[left] <= nums[mid]){

                if(target >= nums[left] && target <= nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }

            else{       // if right half is sorted

                if(target >= nums[mid] && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }

        return -1;
    }
}