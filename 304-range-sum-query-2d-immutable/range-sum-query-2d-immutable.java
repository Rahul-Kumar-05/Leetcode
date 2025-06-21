class NumMatrix {

    private int prefix[][];

    public NumMatrix(int[][] matrix) {
        
        int row = matrix.length; 
        int col = matrix[0].length;

        prefix = new int[row+1][col+1];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                prefix[i+1][j+1] = matrix[i][j] + prefix[i][j+1] + prefix[i+1][j] - prefix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int res = prefix[row2+1][col2+1] - prefix[row1][col2+1] - prefix[row2+1][col1] + prefix[row1][col1];

        return res;        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */