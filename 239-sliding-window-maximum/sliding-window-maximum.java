class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length; 

        if(n == 0 || k == 0) return new int[0];

        int res[] = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<nums.length; i++){

            if(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                res[i-k+1] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}