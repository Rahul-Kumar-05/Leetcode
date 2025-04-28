class Solution {
    public String intToRoman(int num) {
        
        String roman = "";
        int integers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String values[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i=0; i<integers.length; i++){

            while(num >= integers[i]){
                roman = roman + values[i];
                num = num - integers[i];
            }
        }

        return roman;
    }
}