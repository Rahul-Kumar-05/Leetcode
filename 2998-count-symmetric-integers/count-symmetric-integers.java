class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int count = 0;
        for(int i=low; i<=high; i++){

            StringBuilder sb = new StringBuilder();
            sb.append(i);
            
            int size = sb.length();
            
            if(size%2 != 0){
                continue;
            }

            int left = 0;
            int right = 0;

            for(int j=0; j<size/2; j++){
                left += sb.charAt(j)-'0';
                right += sb.charAt(size-1 - j)-'0';
            }

            if(left == right){
                count++;
            }
        }

        return count;
    }
}