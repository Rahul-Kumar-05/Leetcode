class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int n = blocks.length();
        int minwhite = 0; 
        int white = 0;

        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }
        minwhite = white;

        // Sliding window
        for(int i=k; i<n; i++){
                        
            if(blocks.charAt(i-k) == 'W'){
                white--;          //removes the leftmost 'w'
            }

            if(blocks.charAt(i) == 'W'){
                white++;          // adds the lastmost 'w'
            }

            if(minwhite > white){
                minwhite = white;
            }
        }

        return minwhite;
    }
}