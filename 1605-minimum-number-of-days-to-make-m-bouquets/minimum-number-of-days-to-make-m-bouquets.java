class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long mul = (long) m*k;
        if(mul > bloomDay.length){
            return -1;
        }
    
        int l = Arrays.stream(bloomDay).min().getAsInt();
        int h =Arrays.stream(bloomDay).max().getAsInt();

        while(l<=h){
            int mid = l+ (h-l)/2;

            if(isvalid(bloomDay,mid,m,k)){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }

    public boolean isvalid(int[] arr, int mid, int m, int k){
        int flower =0;
        int boo = 0;

        for(int i : arr){
            if(i<=mid){
                flower++;
                if(flower==k){
                    flower=0;
                     boo++;
              }
            }
            else{
                flower =0;
            }

            if(boo==m){
                return true;
            }
        }

        return false;
    }
}