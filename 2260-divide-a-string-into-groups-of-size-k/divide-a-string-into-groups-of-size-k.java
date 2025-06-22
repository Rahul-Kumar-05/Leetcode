class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int n = s.length();
        int size;

        if(n%k == 0){
            size = n/k;
        }
        else{
            size = (n/k) + 1;
        }

        String arr[] = new String[size];

        int idx = 0;

        for(int i=0; i<size; i++){
            StringBuilder sb = new StringBuilder();

            for(int j=0; j<k; j++){
                if(idx < n){
                    sb.append(s.charAt(idx));
                    idx++;
                }
                else{
                    sb.append(fill);
                    // idx++;
                }
            }

            arr[i] = sb.toString();
        }

        return arr;
    }
}