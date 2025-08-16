class Solution {
    public int maximum69Number (int num) {
        
        String n = Integer.toString(num);
        StringBuilder n1 = new StringBuilder(n);

        for(int i=0; i<n.length(); i++){
            if(n1.charAt(i) == '6'){
                n1.setCharAt(i, '9');
                break;
            }
        }

        
        return Integer.parseInt(n1.toString());
    }
}