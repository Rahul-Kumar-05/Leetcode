class Solution {
    public int minimumOperations(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int last = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(set.contains(nums[i])){
                break;
            }
            last++;
            set.add(nums[i]);
        }

        double remaining = nums.length - last;

        double ans = Math.ceil(remaining/3); 
        System.out.println(ans);

        return (int)ans;
    }
}