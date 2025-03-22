class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> ans = new ArrayList<>();

        int pascal[][] = new int[rowIndex+1][rowIndex+1];
        pascal[0][0] = 1;

        for(int i=1; i<pascal.length; i++){
            for(int j=0; j<=i; j++){

                if(j-1 < 0){
                    pascal[i][j] = pascal[i-1][j];
                    
                    if(i == rowIndex){
                        ans.add(pascal[i][j]);
                    }
                }
                else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];

                    if(i == rowIndex){
                        ans.add(pascal[i][j]);
                    }
                }
            }
        }

        if(rowIndex == 0){
            ans.add(1);
        }

        return ans;
    }
}