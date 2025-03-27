class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int ans = 0;
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

        return ans;
    }
}