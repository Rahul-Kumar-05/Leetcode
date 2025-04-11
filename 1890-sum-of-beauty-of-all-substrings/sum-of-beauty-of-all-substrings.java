class Solution {

    public static int getMax(int arr[]){
        int max = 0;

        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static int getMin(int arr[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                min = Math.min(min, arr[i]);
            }
        }

        return min;
    }

    public int beautySum(String s) {
        
        char ch[] = s.toCharArray();
        int sum = 0;

        for(int i=0; i<ch.length; i++){
            
            int freq[] = new int[26];
            for(int j=i; j<ch.length; j++){
                
                freq[ch[j] - 'a']++;

                int beauty = getMax(freq) - getMin(freq);
                sum += beauty;
            }
        }

        return sum;
    }
}