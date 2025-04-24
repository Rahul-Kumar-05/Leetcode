class Solution {
    public static int digit_square_sum(int num){
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit*digit;
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        boolean flag = true;
        int num = n;

        while(flag){
            int sum = digit_square_sum(num);
            if(sum == 1){
                return true;
            }

            if(set.contains(sum)){
                return false;
            }
            
            set.add(sum);
            num = sum;
        }

        return true;
    }
}