class Solution {
    public int maxDifference(String s) {
        
        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        int maxodd = 0;
        int mineven = Integer.MAX_VALUE;

        for(int i=0; i<26; i++){
            if(freq[i] == 0) continue;

            if(freq[i] % 2 != 0){
                maxodd = Math.max(maxodd, freq[i]);
            }
            else{
                mineven = Math.min(mineven, freq[i]);
            }
        }

        return maxodd - mineven;
    }
}