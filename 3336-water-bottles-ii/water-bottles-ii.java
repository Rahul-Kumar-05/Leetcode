class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int drunk = numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            int full = 0;

            while(empty >= numExchange){
                full++;
                empty -= numExchange;
                numExchange++;
            }

            drunk += full;
            empty += full;
        }

        return drunk;
    }
}