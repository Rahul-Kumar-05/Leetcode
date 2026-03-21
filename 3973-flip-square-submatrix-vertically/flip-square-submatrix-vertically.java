class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        
        int top = x;
        int bottom = x+k-1;

        int left = y;
        int right = y+k;

        while(top < bottom){
            for(int i=left; i<right; i++){

                int temp = grid[top][i];
                grid[top][i] = grid[bottom][i];
                grid[bottom][i] = temp;
            }

            top++;
            bottom--;
        }

        return grid;
    }
}