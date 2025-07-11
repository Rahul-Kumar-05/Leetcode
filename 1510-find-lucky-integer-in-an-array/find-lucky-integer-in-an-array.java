class Solution {
    public int findLucky(int[] arr) {
        
        int freq[] = new int[501];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        int lucky_number = -1;

        for(int i=1; i<500; i++){
            if(freq[i] == i){
                lucky_number = freq[i];
            }
        }

        return lucky_number;
    }
}