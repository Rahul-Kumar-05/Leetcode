class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        int diagonal = 0;
        int area = 0;

        for(int i=0; i<dimensions.length; i++){
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            int diag = (length*length + width*width);

            if(diag > diagonal){
                area = length * width;
                diagonal = diag;
            }
            else if(diag == diagonal){
                int temp = length * width;
                
                if(temp > area){
                    area = temp;
                }
            }
        }

        return area;
    }
}