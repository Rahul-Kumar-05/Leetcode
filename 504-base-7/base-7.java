class Solution {
    public String convertToBase7(int num) {
        
        boolean flag = false;

        if(num < 0){
            flag = true;
            num = -num;
        }

        StringBuilder sb = new StringBuilder();
        
        while(num/7 > 0){
            int rem = num % 7;
            sb.append(Integer.toString(rem));
            num = num/7;
        }
        sb.append(Integer.toString(num%7));
        sb.reverse();

        int n = Integer.parseInt(sb.toString());

        if(flag){
            n = -n;
        }

        String ans = Integer.toString(n);

        return ans;
    }
}