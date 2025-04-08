class Solution {
    public int minimumOperations(int[] nums) {

        int freq[] = new int[101];

        for(int i=nums.length-1; i>=0; i--){
            if(freq[nums[i]] > 0){
                return (int) Math.ceil((double)(i + 1)/3);
            } 

            freq[nums[i]]++;
        }

        return 0;
    }
}