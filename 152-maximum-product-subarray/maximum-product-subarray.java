class Solution {
    public int maxProduct(int[] nums) {
        
        int prefix = 1;
        int prefixmax = Integer.MIN_VALUE;

        int suffix = 1;
        int suffixmax = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            prefix *= nums[i];

            prefixmax = Math.max(prefixmax, prefix);

            if(prefix == 0){
                prefix = 1;
            }
        }

        for(int i=nums.length-1; i>=0; i--){
            suffix *= nums[i];

            suffixmax = Math.max(suffixmax, suffix);

            if(suffix == 0){
                suffix = 1;
            }
        }

        return Math.max(suffixmax, prefixmax);
    }
}