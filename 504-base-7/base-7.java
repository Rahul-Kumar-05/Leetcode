class Solution {
    public String convertToBase7(int num) {
        
        if(num == 0){
            return "0";
        }

        boolean flag = false;

        if(num < 0){
            flag = true;
            num = -num;
        }

        StringBuilder sb = new StringBuilder();
        
        while(num > 0){
            int rem = num % 7;
            sb.append(Integer.toString(rem));
            num = num/7;
        }

        if(flag){
            sb.append('-');
        }

        sb.reverse();       

        return sb.toString();
    }
}