class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        HashSet<Integer> s = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }

        int distinct = s.size();

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                set.add(nums[j]);

                if(set.size() == distinct){
                    count++;
                }
            }
            set.clear();
        }

        return count;
    }
}