class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int n = arr.length-1;

        for(int i=0; i<n-1; i++){
            int a = arr[i];
            int b = arr[i+1];
            int c = arr[i+2];
            
            if(a%2 != 0 && b%2 != 0 && c%2 !=0){
                return true;
            }
        }

        return false;
    }
}