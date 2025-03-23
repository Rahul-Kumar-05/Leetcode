class Solution {
    public int[][] generateMatrix(int n) {
        
        int matrix[][] = new int[n][n];

        int left = 0; 
        int right = matrix[0].length-1;

        int top = 0;
        int bottom = matrix.length-1;

        int val = 1;

        while(left <= right && top <= bottom){

            // top row : from left to right
            for(int i=left; i<=right; i++){
                matrix[top][i] = val;
                val++;
            }
            top++;

            // right column : from top to bottom
            for(int i=top; i<=bottom; i++){
                matrix[i][right] = val;
                val++;
            }
            right--;

            // bottom row : from right to left
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    matrix[bottom][i] = val;
                    val++;
                }
                bottom--;
            }

            // left column : from bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    matrix[i][left] = val;
                    val++;
                }
                left++;
            }
        }

        return matrix;
    }
}