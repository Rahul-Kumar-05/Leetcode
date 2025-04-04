class Solution {

    public static boolean isValid(int arr[], int mid, int m){

        int prev = arr[0];
        int currcount = 1;

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];

            if(curr - prev >= mid){
                currcount++;
                prev = curr;
            }

            if(currcount == m){
                break;
            }
        }

        return (currcount == m);
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int minForce = 1;
        int maxForce = position[position.length-1] - position[0];

        int res = 0;
        while(minForce <= maxForce){
            int mid = minForce + (maxForce-minForce)/2;

            if(isValid(position, mid, m)){
                res = mid;
                minForce = mid+1;
            }
            else{
                maxForce = mid-1;
            }
        }

        return res;
    }
}