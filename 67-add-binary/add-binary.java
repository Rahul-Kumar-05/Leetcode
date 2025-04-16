class Solution {
    public String addBinary(String a, String b) {
        
        int n = a.length()-1;
        int m = b.length()-1;
        int max = Math.max(n, m);

        char arr[] = new char[max+2]; 
        int l = arr.length-1;

        boolean carry = false;
        while(n>=0 && m>=0){

            if(a.charAt(n) == '1' && b.charAt(m) == '1'){
                if(carry){
                    arr[l] = '1';
                    l--;
                }
                else{
                    arr[l] = '0';
                    l--;
                }
                carry = true;
            }

            else if((a.charAt(n) == '1' && b.charAt(m) == '0') || (a.charAt(n) == '0' && b.charAt(m) == '1')){
                if(carry){
                    arr[l] = '0';
                    carry = true;
                }
                else{
                    arr[l] = '1';
                }
                l--;
            }

            else if(a.charAt(n) == '0' && b.charAt(m) == '0'){
                if(carry){
                    arr[l] = '1';
                    carry = false;
                }
                else{
                    arr[l] = '0';
                }
                l--;
            }

            n--;
            m--;
        }

        while(n >= 0){
            if(a.charAt(n) == '1'){
                if(carry){
                    arr[l] = '0';
                    l--;
                }
                else{
                    arr[l] = '1';
                    l--;
                    carry = false;
                }
            }

            else{
                if(carry){
                    arr[l] = '1';
                    l--;
                    carry = false;
                }
                else{
                    arr[l] = '0';
                    l--;
                }
            }
            n--;
        }

        while(m >= 0){
             if(b.charAt(m) == '1'){
                if(carry){
                    arr[l] = '0';
                    l--;
                }
                else{
                    arr[l] = '1';
                    l--;
                    carry = false;
                }
            }

            else{
                if(carry){
                    arr[l] = '1';
                    l--;
                    carry = false;
                }
                else{
                    arr[l] = '0';
                    l--;
                }
            }
            m--;
        }

        if(carry){
            arr[l] = '1';
        }

        int t = arr.length;

        if(carry){
            return new String(arr);
        }

        return new String(arr).substring(1, t);
    }
}