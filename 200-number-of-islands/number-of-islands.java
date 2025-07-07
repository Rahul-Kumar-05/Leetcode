class Solution {

    static int dir_row[] = {-1, 0, 0, 1};
    static int dir_col[] = {0, -1, 1, 0};

    static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }


    public static void BFS(int i, int j, char grid[][], int vis[][]){
        vis[i][j] = 1;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i, j));

        while(!q.isEmpty()){
            Pair p = q.poll();
            int row = p.row;
            int col = p.col;
            
            for(int k=0; k<4; k++){
                int newrow = row + dir_row[k];
                int newcol = col + dir_col[k];

                if(newrow >= 0 && newrow < grid.length && newcol >= 0 && newcol < grid[0].length && grid[newrow][newcol] == '1' && vis[newrow][newcol] == 0){
                    vis[newrow][newcol] = 1;
                    q.offer(new Pair(newrow, newcol));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int row = grid.length; 
        int col = grid[0].length;

        int vis[][] = new int[row][col];

        int no_of_islands = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    BFS(i, j, grid, vis);
                    no_of_islands++;
                }
            }
        } 

        return no_of_islands;
    }
}