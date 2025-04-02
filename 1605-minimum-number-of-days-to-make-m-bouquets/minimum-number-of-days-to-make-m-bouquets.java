
class Solution {

    public static boolean isValid(int arr[], int day, int m, int k){

        int flower = 0;
        int book = 0;

        for(int i : arr){
            if(i <= day){
                flower++;

                if(flower == k){
                    flower = 0;
                    book++;
                }
            }
            else{
                flower = 0;
            }

            if(book >= m){
                return true;
            }
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long mul = (long)m*k;
        if(mul > bloomDay.length){
            return -1;
        }

        int l = Arrays.stream(bloomDay).min().getAsInt();
        int h = Arrays.stream(bloomDay).max().getAsInt();

        while(l < h){
            int mid = l + (h-l)/2;

            if(isValid(bloomDay, mid, m, k)){
                h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        
        return l;
    }
}