class Solution {
    public int[] minOperations(String boxes) {
        
        int answer[] = new int[boxes.length()];

        for(int i=0; i<boxes.length(); i++){
            
            int moves = 0;
            
            // right
            for(int j=i+1; j<boxes.length(); j++){
                if(boxes.charAt(j) == '1'){
                    moves += Math.abs(j-i);
                }
            }

            //left
            for(int j=i-1; j>=0; j--){
                if(boxes.charAt(j) == '1'){
                    moves += Math.abs(i-j);
                }
            }

            answer[i] = moves;
        }

        return answer;
    }
}