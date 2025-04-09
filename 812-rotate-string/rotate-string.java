class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }
    
        int len = s.length();

        for(int shift=0; shift<len; shift++){
            int i=0;

            while(i<len && s.charAt(i) == goal.charAt((i+shift) % len)){
                i++;
            }

            if(i == len){
                return true;
            }
        }

        return false;
    }
}