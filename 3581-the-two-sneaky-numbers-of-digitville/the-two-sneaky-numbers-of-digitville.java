class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int res[] = new int[2];
        int freq[] = new int[101];

        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        int j = 0;

        for(int i=0; i<freq.length; i++){
            if(freq[i] == 2){
                res[j] = i;
                j++;
            }
        }

        return res;
    }
}