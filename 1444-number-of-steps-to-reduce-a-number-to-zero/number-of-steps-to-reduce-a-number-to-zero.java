class Solution {
    public int numberOfSteps(int num) {
        
        return count(num, 0);
    }

    public static int count(int num, int count){
        if(num == 0){
            return count;
        }

        if(num % 2 == 0){
            num /= 2;
        }
        else{
            num -= 1;
        }

        return count(num, count+1);
    }
}