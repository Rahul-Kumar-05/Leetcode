class Solution {
    public int trap(int[] height) {
        // int n = height.length;

        // int leftMax[] = new int[n];
        // leftMax[0] = height[0];
        // for(int i=1; i<n; i++){  
        //     leftMax[i] = Math.max(height[i], leftMax[i-1]);
        // }

        // int rightMax[] = new int[n];
        // rightMax[n-1] = height[n-1];
        // for(int i=n-2; i>=0; i--){
        //     rightMax[i] = Math.max(height[i], rightMax[i+1]);
        // }

        // int trap = 0;
        // for(int i=0; i<n; i++){
        //     int waterlevel = Math.min(leftMax[i], rightMax[i]);
        //     trap += waterlevel - height[i];
        // }

        // return trap;

        int left = 0;
        int right = height.length-1;

        int leftMax = height[left];
        int rightMax = height[right];

        int trap = 0;

        while(left < right){

            if(leftMax < rightMax){
                left++;

                leftMax = Math.max(leftMax, height[left]);
                trap = trap + leftMax - height[left];
            }

            else{
                right--;

                rightMax = Math.max(rightMax, height[right]);
                trap = trap + rightMax - height[right];
            }
        }

        return trap;
    }
}