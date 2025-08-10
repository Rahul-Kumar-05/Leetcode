class Solution {
    public static String newNumber(int n){
        char[] nums = String.valueOf(n).toCharArray();

        Arrays.sort(nums);

        return new String(nums);
    }

    public boolean reorderedPowerOf2(int n) {
        
        String target = newNumber(n);

        for(int i=0; i<31; i++){
            if(newNumber(1 << i).equals(target)){
                return true;
            }
        }

        return false;
    }
}