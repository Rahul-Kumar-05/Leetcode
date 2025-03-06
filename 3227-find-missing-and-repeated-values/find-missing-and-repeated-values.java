class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int repeating = 0;

        int ans[] = new int[2];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){

                int curr = Math.abs(grid[i][j]);
                int row = (curr-1) / n;
                int col = (curr-1) % n;

                if(grid[row][col] < 0){
                    repeating = Math.abs(grid[i][j]);
                }
                else{
                    grid[row][col] = -grid[row][col];
                }
            }
        }

        int missing = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){

                if(grid[i][j] >= 0){
                    missing = (i*n) + (j+1); 
                }
            }
        }

        ans[0] = repeating;
        ans[1] = missing;

        return ans;
    }
}