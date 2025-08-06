class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int n = fruits.length;
        int m = baskets.length;

        int placed = 0;

        for(int i=0; i<n; i++){
            int curr = fruits[i];

            for(int j=0; j<m; j++){
                if(curr <= baskets[j]){
                    baskets[j] = -1;
                    placed++;
                    break;
                }
            }
        }

        return n - placed;
    }
}