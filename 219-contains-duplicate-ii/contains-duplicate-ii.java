class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;
        
        while(j < nums.length){
            if(j-i <= k){
                if(set.contains(nums[j])){
                    return true;
                }
                else{
                    set.add(nums[j]);
                }
                
                j++;
            }

            else{
                set.remove(nums[i]);
                i++;
            }
        }

        return false;
    }
}