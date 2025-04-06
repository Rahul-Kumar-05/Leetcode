class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())  return false;

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        int freq[] = new int[26];

        for(int i=0; i<ch1.length; i++){
            freq[ch1[i]-'a']++;
            freq[ch2[i]-'a']--;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0)  return false;
        }

        return true;
    }
}