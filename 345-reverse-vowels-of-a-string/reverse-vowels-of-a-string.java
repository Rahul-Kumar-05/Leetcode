class Solution {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        
        char ch[] = s.toCharArray();

        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if(!isVowel(ch[start])){
                start++;
            }
            if(!isVowel(ch[end])){
                end--;
            }
            if(isVowel(ch[start]) && isVowel(ch[end])){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }
        }

        return new String(ch);
    }
}