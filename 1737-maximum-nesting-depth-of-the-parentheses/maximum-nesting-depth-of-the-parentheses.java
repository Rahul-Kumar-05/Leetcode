class Solution {
    public int maxDepth(String s) {
        
        char ch[] = s.toCharArray();

        int max = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++){

            if(ch[i] == '('){
                count++;
                max = Math.max(max, count);
            }
            else if(ch[i] == ')'){
                count--;
            }
        }

        return max;
    }
}