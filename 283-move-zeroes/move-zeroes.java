class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = 0;

        while(j < n){
            if(arr[j] == 0){
                j++;
            }
            else{
                arr[i] = arr[j];
                i++;
                j++;
            }
        }

        while(i < n){
            arr[i] = 0;
            i++;
        }
    }
}