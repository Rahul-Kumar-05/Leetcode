class Solution {

    public static int countOnes(int n){
        
        int ones = 0;

        while(n > 0){
            if((n % 2) != 0){
                ones++;
            }

            n = n/2;
        }

        return ones;
    }

    public int[] sortByBits(int[] arr) {

        int n = arr.length;
        int bitArr[] = new int[n];

        for(int i=0; i<n; i++){
            bitArr[i] = countOnes(arr[i]);
        }  

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){

                if(bitArr[j] > bitArr[j+1] || (bitArr[j] == bitArr[j+1] && arr[j] > arr[j+1])){
                    
                    int temp = bitArr[j];
                    bitArr[j] = bitArr[j+1];
                    bitArr[j+1] = temp;

                    int temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                }
            }
        }  

        return arr;    
    }
}