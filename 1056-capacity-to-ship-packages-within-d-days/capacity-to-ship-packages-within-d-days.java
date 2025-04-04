class Solution {

    public static boolean isValid(int arr[], int capacity, int days){
        int d = 1;

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            
            if(sum > capacity){
                d++;
                sum = arr[i];
            }
        }

        return (d <= days);
    }

    public int shipWithinDays(int[] weights, int days) {

        int minWeight = Arrays.stream(weights).max().getAsInt();
        int maxWeight = Arrays.stream(weights).sum();

        int res = 0;
        while(minWeight <= maxWeight){
            int mid = minWeight + (maxWeight - minWeight)/2;

            if(isValid(weights, mid, days)){
                res = mid;
                maxWeight = mid - 1;
            }
            else{
                minWeight = mid + 1;
            }
        }

        return res;
    }
}