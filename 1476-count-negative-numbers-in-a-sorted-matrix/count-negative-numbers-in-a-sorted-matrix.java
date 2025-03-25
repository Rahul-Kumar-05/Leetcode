class Solution {

    public static int bs(int arr[][], int i){

        int low = 0;
        int high = arr[i].length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[i][mid] < 0 && (mid == 0 || arr[i][mid-1] >= 0)){
                return arr[i].length - mid;
            }

            else if(arr[i][mid] < 0 && arr[i][mid-1] < 0){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return 0;
    }

    public int countNegatives(int[][] grid) {
        
        int n = grid.length;
        int res = 0;

        for(int i=0; i<n; i++){
            res = res + bs(grid, i);
        }

        return res;
        
        /*int n = grid[0].length;

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

        return res; */
    }
}