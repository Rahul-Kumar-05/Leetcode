class Solution {
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }

        return false;
    }

    public String sortVowels(String s) {
        
        char str[] = s.toCharArray();

        int vowelCount = 0;

        for(int i=0; i<str.length; i++){
           
            if(isVowel(str[i])){
                vowelCount++;
            }
        }

        char vowels[] = new char[vowelCount];
        int k = 0;

        for(int i=0; i<str.length; i++){
            if(isVowel(str[i])){
                vowels[k] = str[i];
                k++;
            }
        }

        Arrays.sort(vowels);
        k = 0;

        for(int i=0; i<str.length; i++){
            if(isVowel(str[i])){
                str[i] = vowels[k];
                k++;
            }
        }

        return new String(str);
    }
}