class Solution {
    public int countNegatives(int[][] grid) {
        
        int n = grid[0].length;


        int res = 0;

        int row = grid.length-1;
        int col = 0;

        while(row >= 0 && col < n){
            
            if(grid[row][col] >= 0){
                col++;
            }
            else{
                res = res + (n - col);
                row--;
            }
        }

        return res;
    }
}