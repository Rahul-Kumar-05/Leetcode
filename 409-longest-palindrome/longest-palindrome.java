class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int odd = 0;

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

            if(map.get(s.charAt(i))%2 == 1){
                odd++;
            }
            else{
                odd--;
            }
        }

        if(odd > 1){
            return s.length() - odd + 1;
        }

        return s.length();
        
    }
}