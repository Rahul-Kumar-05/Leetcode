class Solution {
    public int minimumOperations(int[] nums) {

        int freq[] = new int[101];

        // int last = 0;
        int idx = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(freq[nums[i]] > 0){
                idx = i;

                return (int) Math.ceil((double)(i + 1)/3);
            }
            // last++;
            freq[nums[i]]++;
        }

        // // double remaining = nums.length - last;
        // double remaining = idx + 1;

        // double ans = Math.ceil(remaining/3); 
        // System.out.println(ans);

        // return (int)ans;
        return 0;
    }
}