class Solution {
    public int countDays(int days, int[][] meetings) {
        
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int prevDay = 0;

        for(int meeting[] : meetings){
            
            int start = Math.max(meeting[0], prevDay+1);
            int length = meeting[1] - start+1;

            days -= Math.max(length, 0);

            prevDay = Math.max(prevDay, meeting[1]);
        }

        return days;
    }
}