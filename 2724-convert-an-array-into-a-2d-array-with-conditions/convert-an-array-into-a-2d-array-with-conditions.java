class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         
        List<List<Integer>> res = new ArrayList<>();

        int freq[] = new int[nums.length+1];

        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        int max = 0;
        for(int i=0; i<freq.length; i++){
            max = Math.max(max, freq[i]);
        }

        while(max > 0){
            List<Integer> temp = new ArrayList<>();

            for(int i=0; i<freq.length; i++){
                if(freq[i] > 0){
                    temp.add(i);
                    freq[i]--;
                }
            }

            res.add(temp);
            max--;
        }

        return res;
    }
}