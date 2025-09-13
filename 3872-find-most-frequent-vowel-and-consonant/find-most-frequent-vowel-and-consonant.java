class Solution {
    public int maxFreqSum(String s) {
        
        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int vowel = 0;
        int consonent = 0;

        for(int i=0; i<26; i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20){
                vowel = Math.max(vowel, freq[i]);
            }

            else{
                consonent = Math.max(consonent, freq[i]);
            }
        }

        int res = vowel + consonent;

        return res;
    }
}