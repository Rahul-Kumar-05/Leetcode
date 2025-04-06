class Solution {
    public boolean isAnagram(String s, String t) {

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        if(ch1.length != ch2.length)  return false;

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