class Solution {
    public int mySqrt(int x) {
        // int ans = (int)Math.sqrt(x);

        int low = 1;
        int high = x;
        int mid = 0;
        int ans = 0;

        while (low <= high){
            mid = low + (high-low)/2;

            if(mid <= x/mid){
                ans = mid;
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }

        }

        return ans;
    }
}