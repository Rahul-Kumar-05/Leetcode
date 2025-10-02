class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int drunk = numBottles;
        int empty = numBottles;
        int full = 0;

        while(empty >= numExchange){

            while(empty >= numExchange){
                full++;
                empty -= numExchange;
                numExchange++;
            }

            drunk += full;
            empty += full;
            full = 0;
        }

        return drunk;
    }
}