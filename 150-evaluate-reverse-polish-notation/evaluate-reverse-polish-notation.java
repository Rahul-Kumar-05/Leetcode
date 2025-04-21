class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        
        for(String token : tokens){

            if(token.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();

                int res = num2 + num1;

                st.push(res);
            }

            else if(token.equals("-")){
                int num1 = st.pop();
                int num2 = st.pop();

                int res = num2 - num1;

                st.push(res);
            }

            else if(token.equals("*")){
                int num1 = st.pop();
                int num2 = st.pop();

                int res = num2 * num1;

                st.push(res);
            }

            else if(token.equals("/")){
                int num1 = st.pop();
                int num2 = st.pop();

                int res = num2 / num1;

                st.push(res);
            }

            else{
                int num = Integer.parseInt(token);

                st.push(num);
            }
        }

        return st.peek();
    }
}