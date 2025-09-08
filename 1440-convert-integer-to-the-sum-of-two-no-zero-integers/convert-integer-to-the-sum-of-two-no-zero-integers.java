class Solution {

    public static boolean ContainsZero(int num){
        
        if(String.valueOf(num).contains("0")){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean containsZero(int num){

        while(num > 0){
            int ld = num % 10;

            if(ld == 0) return false;

            num = num / 10;
        }

        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        
        int left = 0; 
        int right = 0;

        int res[] = new int[2];

        for(int i=1; i<n; i++){
            left = i;
            right = n - left;

            if(containsZero(left) && containsZero(right)){
                
                res[0] = left;
                res[1] = right;

                return res;
            }
        }

        return res;
    }
}