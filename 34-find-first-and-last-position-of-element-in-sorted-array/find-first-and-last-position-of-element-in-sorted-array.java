class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[] = new int[2];

        int low = 0; 
        int high = nums.length-1;
       
        int start = 0;
        int end = 0;

        int ans = 0;

        while(low <= high){
            
            int mid = (high + low)/2;

            if(nums[mid] == target){
                ans = mid;

                for(int i=mid; i<nums.length; i++){
                    if(nums[i] == target){
                        end = i;
                    }
                    else{
                        break;
                    }
                }

                for(int i=mid; i>=0; i--){
                    if(nums[i] == target){
                        start = i;
                    }
                    else{
                        break;
                    }
                }

                res[0] = start;
                res[1] = end;

                return res; 
            }

            else if(nums[mid] < target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        
        res[0] = -1;
        res[1] = -1;

        return res;
    }
}