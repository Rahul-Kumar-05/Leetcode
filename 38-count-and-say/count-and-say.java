class Solution {
    public static String RLE(String s){

        int count = 1;

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                sb.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }

        sb.append(count).append(s.charAt(s.length()-1));

        return sb.toString();
    }

    public String countAndSay(int n) {
        
        String res = "1";

        for(int i=1; i<n; i++){
            res = RLE(res);
        }

        return res;
    }
}