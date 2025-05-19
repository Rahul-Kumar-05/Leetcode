class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);

        int n = costs.length;
        int res = 0;
        // int cost = 0;

        for(int i=0; i<n; i++){
            if(costs[i] > coins) break;

            res++;
            coins = coins - costs[i];
        }

        return res;
    }
}