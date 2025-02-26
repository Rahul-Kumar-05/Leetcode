class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;

        while(low < high){
            char l = s.charAt(low);
            char r = s.charAt(high);

            if(!Character.isLetterOrDigit(l)){
                low++;
            }

            else if(!Character.isLetterOrDigit(r)){
                high--;
            }

            else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }

            else{
                low++;
                high--;
            }
        }

        return true;
    }
}