class Solution {
    public String customSortString(String order, String s) {
        
        char freq[] = new char[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for(int i=0; i<order.length(); i++){
            
            while(freq[order.charAt(i) - 'a'] > 0){
                ans.append(order.charAt(i));
                freq[order.charAt(i) - 'a']--;
            }
        }

        for(char c='a'; c<='z'; c++){
            
            while(freq[c - 'a'] > 0){
                ans.append(c);
                freq[c - 'a']--;
            }
        }

        return ans.toString();
    }
}