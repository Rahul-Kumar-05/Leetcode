class Solution {

    public static int countOne(int num){

        int count = 0;

        while(num > 0){
            if(num % 2 == 1){
                count++;
            }

            num = num/2;
        }

        return count;
    }

    public static boolean isPrime(int num){

        if(num <= 1){
            return false;
        }

        boolean flag = true;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num  % i == 0){
                flag = false;
                break;
            }
        }

        return flag;
    }

    public int countPrimeSetBits(int left, int right) {
        
        int res = 0;

        for(int i=left; i<=right; i++){
            int oneCount = countOne(i);

            if(isPrime(oneCount)){
                res++;
            } 
        }
        
        return res;
    }
}