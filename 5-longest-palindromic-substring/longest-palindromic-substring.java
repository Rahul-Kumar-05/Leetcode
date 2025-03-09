class Solution {

    public static String subString(String s, int low, int high){
        int n = s.length();
        
        while(low>=0 && high<n){
            if(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            else{
                break;
            }
        }

        return s.substring(low+1, high);
    }

    public String longestPalindrome(String s) {
        
        int max = 0;
        String ans = "";

        for(int i=0; i<s.length(); i++){
            // for odd case
            String curr = subString(s, i, i);
            if(curr.length() > max){
                max = curr.length();
                ans = curr;
            }

            // for even case
            curr = subString(s, i, i+1);
            if(curr.length() > max){
                max = curr.length();
                ans = curr; 
            }
        }

        return ans;
    }
}