class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;

        int nsr[] = new int[n];
        int nsl[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            int curr = heights[i];

            while(!st.isEmpty() && curr <= heights[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        for(int i=n-1; i>=0; i--){
            int curr = heights[i];

            while(!st.isEmpty() && curr <= heights[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = st.peek();
            }

            st.push(i);
        }

        int max = 0;

        for(int i=0; i<n; i++){
            int width = nsr[i] - nsl[i] - 1;

            int area = heights[i] * width;

            max = Math.max(max, area);
        }

        return max;
    }
}