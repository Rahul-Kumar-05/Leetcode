class Solution {
    public String breakPalindrome(String palindrome) {
        
        if(palindrome.length() <= 1){
            return "";
        }

        char arr[] = palindrome.toCharArray();

        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != 'a'){
                arr[i] = 'a';

                return String.valueOf(arr);
            }
        }
        // if we reach here, there are ONLY 'a' in palindrome string, so we should change the last character to b
        arr[arr.length-1] = 'b';

        return String.valueOf(arr);
    }
}