class Solution {
    public static int getRotation(int top[], int bottom[], int target){

        int rotatetop = 0;
        int rotatebottom = 0;

        for(int i=0; i<top.length; i++){
            if(top[i] != target && bottom[i] != target){
                return Integer.MAX_VALUE;
            }

            if(top[i] != target){
                rotatetop++;
            }

            if(bottom[i] != target){
                rotatebottom++;
            }
        }

        return Math.min(rotatetop, rotatebottom);
    }

    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int res = Integer.MAX_VALUE;

        for(int i=1; i<=6; i++){
            res = Math.min(res, getRotation(tops, bottoms, i));
        }

        if(res == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return res;
        }
    }
}