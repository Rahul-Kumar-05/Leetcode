class Solution {
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length-1;
        int missing = 0;

        while(low <= high){

            int mid = low + (high - low)/2;
            missing = arr[mid] - (mid + 1);
            
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high == -1){
            return k;
        }
        
        missing = arr[high] - (high+1);
        int ans = arr[high] + (k - missing);
        return ans;
        
        /*int ans = 0;
        int num = 1;

        int i = 0;
        while(k > 0 && i<arr.length){
            if(arr[i] != num){
                k--;
                ans = num;
                num++;
            }
            else{
                i++;
                k++;
            }
        }

        if(k > 0){
            ans = ans + k;
        }

        return ans;     */
    }
}