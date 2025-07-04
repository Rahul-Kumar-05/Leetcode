class Solution {

    public static void bfs(char[][] grid, int row, int col, int n, int m){

        if(row < 0 || col < 0 || row >= n || col >=m || grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';

        bfs(grid, row-1, col, n, m);
        bfs(grid, row, col+1, n, m);
        bfs(grid, row+1, col, n, m);
        bfs(grid, row, col-1, n, m);        
    }

    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(grid[i][j] == '1'){
                    bfs(grid, i, j, n, m);
                    count++;
                }
            }
        }

        return count;

    }
}