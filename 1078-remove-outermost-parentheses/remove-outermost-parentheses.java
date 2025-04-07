class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        char arr[] = s.toCharArray();

        int left = 0;
        for(int i=0; i<s.length(); i++){
            
            if(arr[i] == '('){
                left++;
                if(left > 1){
                    sb.append(s.charAt(i));
                }
            }
            else if(left > 1 && arr[i] == ')'){
                sb.append(s.charAt(i));
                left--;
            }
            else{
                left--;
            }
        }

        return sb.toString();
    }
}