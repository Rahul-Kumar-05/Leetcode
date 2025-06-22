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
            if(idx + k > n){
                StringBuilder sb = new StringBuilder();
                int j = n-idx;

                while(j > 0){
                    sb.append(s.charAt(idx));
                    idx++;
                    j--;
                }

                int remaining = k - (n % k);
                while(remaining > 0){
                    sb.append(fill);
                    remaining--;
                }

                arr[i] = sb.toString();
                break;
            }
            arr[i] = s.substring(idx, idx+k);
            idx = idx + k;
        }

        return arr;
    }
}