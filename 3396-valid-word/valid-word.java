class Solution {
    public boolean isValid(String word) {
        
        if(word.length() < 3) return false;

        boolean consonant = false;
        boolean vowel = false;

        word = word.toLowerCase();

        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            else if(Character.isLetter(c)){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowel = true;
                }
                else{
                    consonant = true; 
                }
            }
        }

        return vowel && consonant;
    }
}