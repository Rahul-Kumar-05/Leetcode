class Solution {

    public static boolean isValid(int arr[], int mid, int m){

        int prev = arr[0];
        int countBall = 1;

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];

            if(Math.abs(curr - prev) >= mid){
                countBall++;
                prev = curr;
            }

            if(countBall == m){
                break;
            }
        }

        return (countBall == m);
    }

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        
        int minForce = 1;
        int maxForce = position[position.length-1] - position[0];

        int result = 0;
        while(minForce <= maxForce){
            int mid = minForce + (maxForce - minForce)/2;

            if(isValid(position, mid, m)){
                result = mid;
                minForce = mid + 1;
            }
            else{
                maxForce = mid-1;
            }
        }

        return result;
    }
}