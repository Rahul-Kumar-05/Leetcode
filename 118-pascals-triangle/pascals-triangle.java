class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> li = new ArrayList<>();

        int pascal[][] = new int[numRows][numRows];

        pascal[0][0] = 1;

        for(int i=1; i<numRows; i++){
            for(int j=0; j<numRows; j++){
                
                if(j-1 < 0){
                    pascal[i][j] = pascal[i-1][j];
                }
                else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }                
            }
        }

        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0; j<numRows; j++){
                if(pascal[i][j] != 0)
                    row.add(pascal[i][j]);
            }

            li.add(row);
        }

        return li;
    }
}