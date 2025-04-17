class Solution {    
    public int beautySum(String s) {
        
        char ch[] = s.toCharArray();
        int sum = 0;

        for(int i=0; i<ch.length; i++){            
            int freq[] = new int[26];

            for(int j=i; j<ch.length; j++){
                
                freq[ch[j] - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for(int k=0; k<26; k++){
                    max = Math.max(max, freq[k]);

                    if(freq[k] != 0){
                        min = Math.min(min, freq[k]);
                    }
                }
                int beauty = max - min;
                sum += beauty;
            }
        }

        return sum;
    }
}