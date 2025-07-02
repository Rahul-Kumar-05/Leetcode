class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;

        if(n <= 1){
            return 0;
        }

        int jump = 0;
        int i = 0;

        while(i < n-1){

            if(i + nums[i] >= n - 1){
                jump++;
                break;
            }

            int dist = 0;
            int temp = i;

            for(int j = i+1; j <= i+nums[i] && j<n; j++){
                int currdist = j + nums[j];

                if(currdist >= dist){
                    dist = currdist;
                    temp = j;
                }
            }

            i = temp;
            jump++;
        }

        return jump;
    }
}