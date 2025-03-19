class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> arr = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(left <= right && top <= bottom){

            // from left to right
            for(int i=left; i<=right; i++){
                arr.add(matrix[top][i]);
            }
            top++;

            // from top to bottom
            for(int i=top; i<=bottom; i++){
                arr.add(matrix[i][right]);
            }
            right--;

            // from right to left
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // form bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
            
        } 

        return arr;  
    }
}