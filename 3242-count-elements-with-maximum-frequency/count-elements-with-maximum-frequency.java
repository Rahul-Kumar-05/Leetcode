class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int freq[] = new int[101];

        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        int res = 0;
        int max = 0;

        for(int i=0; i<freq.length; i++){
            max = Math.max(max, freq[i]);
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] == max){
                res += max;
            }
        }

        return res;
    }
}