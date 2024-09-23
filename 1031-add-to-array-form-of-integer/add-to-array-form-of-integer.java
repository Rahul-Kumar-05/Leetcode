class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         List<Integer> ans = new ArrayList<Integer>();

        int p = num.length-1;
        int carry = 0;

        while(p>=0 || k>0){
            int val = 0;

            if(p >= 0){
                val = num[p];
            }

            int ld = k % 10;
            int sum = val + ld + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ans.add(digit);

            k = k/10;
            p--;
        }

        if(carry > 0){
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }
}