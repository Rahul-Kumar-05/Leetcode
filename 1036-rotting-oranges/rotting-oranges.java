class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];

        int freshOrange = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j, 0});
                }

                else if(grid[i][j] == 1){
                    freshOrange++;
                }
            }
        }

        int maxTime = 0;

        while(!q.isEmpty()){
            int pair[] = q.poll();

            int row = pair[0];
            int col = pair[1];
            int time = pair[2];

            maxTime = Math.max(maxTime, time);

            int dir_row[] = {1, 0, 0, -1};
            int dir_col[] = {0, -1, 1, 0};

            for(int k=0; k<4; k++){
                int newRow = row + dir_row[k];
                int newCol = col + dir_col[k];

                if(newRow >= 0 && newRow < n && newCol >=0 && newCol < m && grid[newRow][newCol] == 1 && vis[newRow][newCol] == 0){
                    vis[newRow][newCol] = 1;
                    q.offer(new int[]{newRow, newCol, time+1});

                    freshOrange--;
                }
            }
        }

        if(freshOrange == 0){
            return maxTime;
        }

        return -1;
    }
}