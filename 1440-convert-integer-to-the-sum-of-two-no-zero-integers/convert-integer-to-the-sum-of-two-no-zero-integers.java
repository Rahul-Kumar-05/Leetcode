class Solution {

    public static boolean ContainsZero(int num){
        
        if(String.valueOf(num).contains("0")){
            return false;
        }
        else{
            return true;
        }
    }

    public int[] getNoZeroIntegers(int n) {
        
        int left = 0; 
        int right = 0;

        int res[] = new int[2];

        for(int i=1; i<n; i++){
            left = i;
            right = n - left;

            if(ContainsZero(left) && ContainsZero(right)){
                
                res[0] = left;
                res[1] = right;

                return res;
            }
        }

        return res;
    }
}