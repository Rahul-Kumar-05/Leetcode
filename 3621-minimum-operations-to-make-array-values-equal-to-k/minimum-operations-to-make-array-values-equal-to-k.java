class Solution {
    public int minOperations(int[] nums, int k) {

        int same = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k){
                same++;
                break;
            }
        }
        
        HashSet<Integer> set = new HashSet<>();

        boolean flag = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < k){
                return -1;
            }

            else if(set.contains(nums[i])){
                flag = true;
                continue;
            }
            else{
                set.add(nums[i]);
            }
        }

        return set.size()-same;
    }
}