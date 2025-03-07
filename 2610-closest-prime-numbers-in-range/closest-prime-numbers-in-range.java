class Solution {

    public static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public int[] closestPrimes(int left, int right) {

        int leftMax = -1;
        int rightMax = -1;

        int res[] = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(isPrime(i)){
                arr.add(i);
            }
        } 

        if(arr.size() > 1){
            
            int idx = 0;
            int diff = Integer.MAX_VALUE;
            for(int i=1; i<arr.size(); i++){
                int currdiff = arr.get(i) - arr.get(i-1);
                if(currdiff < diff){
                    diff = currdiff;
                    idx = i;
                }
            }

            leftMax = arr.get(idx-1);
            rightMax = arr.get(idx);
        }  

        res[0] = leftMax;
        res[1] = rightMax;

        return res;
    }
}