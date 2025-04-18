class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }

        int res[] = new int[nums.length];

        int idx = 0;
        for(int i: list){
            res[idx++] = i;
        }

        return res;
    }
}