class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);

        int res = 0;
        int result = 0;

        int left = 0;
        int right = tokens.length-1;

        while(left <= right){
            if(tokens[left] <= power){
                res++;
                power -= tokens[left];
                left++;

                result = Math.max(result, res);
            }

            else if(res > 0){
                res--;
                power += tokens[right];
                right--;
            }

            else{
                left++;
            }
        }

        // if(left == right && tokens[left] <= power){
        //     res++;
        // }

        return result;
    }
}