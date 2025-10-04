class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int temp = 0;

        int start = 0;
        int end = height.length-1;

        while(start < end){
            int h = Math.min(height[start], height[end]);
            temp = h * (end - start);

            max = Math.max(max, temp);

            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }

        return max;
    }
}