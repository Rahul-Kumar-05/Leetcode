class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i+=2){
            
            int j = nums[i];

            while(j > 0){
                list.add(nums[i+1]);
                j--;
            }
        }

        int res[] = new int[list.size()];
        
        int k = 0;
        for(int item: list){
            res[k++] = item;
        }

        return res;
    }
}