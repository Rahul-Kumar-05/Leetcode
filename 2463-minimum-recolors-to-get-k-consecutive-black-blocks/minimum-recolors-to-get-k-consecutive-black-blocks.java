class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int n = blocks.length();
        int minwhite = 0; 
        int white = 0;
        char[] s = blocks.toCharArray();

        for(int i=0; i<k; i++){
            if(s[i] == 'W'){
                white++;
            }
        }
        minwhite = white;

        for(int i=k; i<blocks.length(); i++){
            
            
            if(s[i-k] == 'W'){
                white--;
            }

            if(s[i] == 'W'){
                white++;
            }

            if(minwhite > white){
                minwhite = white;
            }
        }

        return minwhite;
    }
}