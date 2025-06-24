class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                int j = i;
                // set.add(j);

                while(j >= 0 && Math.abs(i-j) <= k){
                    set.add(j);
                    j--;
                }

                j = i;

                while(j < nums.length && Math.abs(i-j) <= k){
                    set.add(j);
                    j++;
                }
            }
        }

        res.addAll(set);
        Collections.sort(res);

        return res;
    }
}