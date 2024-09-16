class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int minutes[] = new int[n];

        for(int i=0; i<n; i++){
            String time = timePoints.get(i);
            String[] parts = time.split(":");

            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            minutes[i] = hour*60 + minute;
        }

        Arrays.sort(minutes);

        int result = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
        //     result = Math.min(result, minutes[i] - minutes[i-1]);
            int temp = minutes[i] - minutes[i-1];
            if(temp < result){
                result = temp;
            }
        }

        // return Math.min(result, 24*60 - minutes[n-1] + minutes[0]);
        int result2 = 24*60 - minutes[n-1] + minutes[0];
        
        if(result < result2){
            return result;
        }
        else{
            return result2;
        }
    }
}