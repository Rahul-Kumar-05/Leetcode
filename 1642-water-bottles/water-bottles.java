class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int res = numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            int exchange = empty / numExchange;
            res += exchange;

            int rem = empty % numExchange;

            empty = exchange + rem;
        }

        return res;
    }
}