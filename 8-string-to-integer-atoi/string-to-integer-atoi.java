class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();

        if(s.length() == 0)  return 0;

        StringBuilder ans = new StringBuilder();

        boolean flag = false;

        int idx = 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
    
            flag = s.charAt(0) == '-';
            idx++;
        }

        for(int i=idx; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                idx++;
            }
            else{
                break;
            }
        }

        for(int i=idx; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                ans.append(s.charAt(i));
            }

            else{
                break;
            }
        }

        String res = ans.toString();

        if(res.length() == 0 || res == "-"){
            return 0;
        }

        try{
            long result = Long.parseLong(res);

            if(flag){
                result = -result;
            }

            if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            else if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            return (int)result;
        }
        catch(Exception a){

            if(flag){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        

       

        
    }
}