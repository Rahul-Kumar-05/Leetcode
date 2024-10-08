class Solution {
    public boolean isPalindrome(int x) {
        int palindrome = x;
        int reverse = 0;

        while(x>0){
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x = x/10;
        }
        if (reverse == palindrome){
            return true;
        }else{
            return false;
        }

    }
}