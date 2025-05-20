class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        int n = plantTime.length;

        int pairs[][] = new int[n][2];

        for(int i=0; i<n; i++){
            pairs[i][0] = plantTime[i];
            pairs[i][1] = growTime[i];
        }

        Arrays.sort(pairs, (a,b) -> b[1] - a[1]);

        int pt = 0;
        int gt = 0;

        for(int pair[] : pairs){
            pt = pair[0] + pt;
            gt = Math.max(gt, pt + pair[1]);
        }

        return gt;
    }
}