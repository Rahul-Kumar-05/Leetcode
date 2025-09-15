class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String words[] = text.split(" ");

        int res = words.length;

        for(String word : words){
            
            for(int i=0; i<brokenLetters.length(); i++){
                
                char ch = brokenLetters.charAt(i);

                if(word.contains(Character.toString(ch))){
                    res--;
                    break;
                }
            }
        }

        return res;
    }
}