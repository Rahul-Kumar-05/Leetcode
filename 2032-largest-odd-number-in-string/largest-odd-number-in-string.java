class Solution {
    public String largestOddNumber(String num) {
        
        StringBuilder sb = new StringBuilder();

        int i = num.length()-1;

        while(i >= 0){

            if((num.charAt(i) - '0')%2 == 0){
                i--;
            }
            else{
                break;
            }
        }

        for(int j=0; j<=i; j++){
            sb.append(num.charAt(j));
        }

        return sb.toString();
    }
}