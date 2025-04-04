class Solution {

    public static boolean isValid(int arr[], int k, int h){
        long hr = 0;

        for(int i : arr){
            double temp = Math.ceil((double)i/k);
            hr += (int)temp;
        }

        return (hr <= h);
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;

        for(int i=0; i<piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        int res = 0;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(isValid(piles, mid, h)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return res;
    }
}