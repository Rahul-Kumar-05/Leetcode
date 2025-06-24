class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        List<Integer> res = new ArrayList<>();

        int right = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                int left = Math.max(right, i-k);
                right = Math.min(nums.length-1, i+k) + 1;

                for(int j=left; j<right; j++){
                    res.add(j);
                }
            }
        }

        return res;
    }
}