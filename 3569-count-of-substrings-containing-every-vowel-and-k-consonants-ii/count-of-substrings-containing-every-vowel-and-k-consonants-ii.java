class Solution {
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }

        return false;
    }
    public long countOfSubstrings(String word, int k) {
        
        int n = word.length();

        Map<Character, Integer> mp = new HashMap<>();

        int nextCons[] = new int[n];
        int lastConsIdx = n;

        // preprocessing
        for(int i=n-1; i>=0; i--){
            nextCons[i] = lastConsIdx;
           
            if(!isVowel(word.charAt(i))){
                lastConsIdx = i;
            }
        }

        int i = 0; 
        int j = 0;
        long count = 0;
        int cons = 0;

        while(j < n){
            char ch = word.charAt(j);
            
            if(isVowel(ch)){
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            }
            else{
                cons++;
            }

            // cons count must be == k
            while(cons > k){
                char ch1 = word.charAt(i);

                if(isVowel(ch1)){
                    mp.put(ch1, mp.getOrDefault(ch1, 0) - 1);

                    if (mp.get(ch1) != null && mp.get(ch1) == 0) {
    mp.remove(ch1);
}
                }
                else{
                    cons--;
                }
                i++;
            }

            while(i < n && mp.size() == 5 && cons == k){  // valid window
                int idx = nextCons[j];
                count += idx - j;

                char ch2 = word.charAt(i);
                if(isVowel(ch2)){
                    mp.put(ch2, mp.getOrDefault(ch2, 0) - 1);

                    if (mp.get(ch2) != null && mp.get(ch2) == 0) {
                        mp.remove(ch2);
                    }
                }
                else{
                    cons--;
                }
                i++;
            }

            j++;
        }

        return count;
    }
}