class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        int min = 0;

        int i = 0;
        int j = 1;

        while(j < colors.length()){

            if(colors.charAt(i) == colors.charAt(j)){
                min += Math.min(neededTime[i], neededTime[j]);
            }

            if(neededTime[i] < neededTime[j] || colors.charAt(i) != colors.charAt(j)){
                i = j;
                j++;
            }
            else{
                j++;
            }
        }

        return min;
    }
}