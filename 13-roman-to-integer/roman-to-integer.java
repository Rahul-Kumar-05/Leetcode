class Solution {
    public static int getValue(char ch){

        switch (ch){
            case 'I':
            return 1;

            case 'V':
            return 5;

            case 'X':
            return 10;

            case 'L':
            return 50;

            case 'C':
            return 100;

            case 'D':
            return 500;

            case 'M':
            return 1000;
        }
        
        return -1;
    }

    public int romanToInt(String s) {

        int sum = 0;
        
        for(int i=0; i<s.length(); i++){
          
            if(i<s.length()-1 && getValue(s.charAt(i)) < getValue(s.charAt(i+1))){
                sum -= getValue(s.charAt(i));
            }
            else{
                sum += getValue(s.charAt(i));
            }
        }
        return sum;
    }
}