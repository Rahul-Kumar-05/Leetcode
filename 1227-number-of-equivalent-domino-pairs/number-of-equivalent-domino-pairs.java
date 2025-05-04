class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
    /*
        HashMap<String, Integer> map = new HashMap<>();

        for(int[] d : dominoes){
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);

            String key = a + "," + b;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int pairs = 0;
        for(int val : map.values()){
            if(val > 1){
                pairs += val * (val-1)/2;
            }
        }
                
        return pairs;
        */

        int map[][] = new int[10][10];

        int res = 0;

        for(int[] pair : dominoes){
            int i = Math.min(pair[0], pair[1]);
            int j = Math.max(pair[0], pair[1]);

            res += map[i][j];
            
            map[i][j]++;
        }

        return res;
    }
}