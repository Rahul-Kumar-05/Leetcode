class Solution {
    public boolean divideArray(int[] nums) {
        
        if((nums.length % 2) != 0){
            return false;
        }

        // Arrays.sort(nums);

        // for(int i=0; i<nums.length; i+=2){

        //     if(nums[i] != nums[i+1]){
        //         return false;
        //     }
        // }

        // return true;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for(int count : mp.values()){

            if(count % 2 != 0){
                return false;
            }
        }

        return true;
    }
}