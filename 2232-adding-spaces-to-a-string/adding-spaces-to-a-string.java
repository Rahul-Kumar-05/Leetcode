class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int offset = 0;
        for(int i=0;i<spaces.length;i++){
            if(spaces[i]+offset <=sb.length()){
                sb.insert(spaces[i]+offset," ");
                offset++;
            }
        }
    return sb.toString();
    }
}