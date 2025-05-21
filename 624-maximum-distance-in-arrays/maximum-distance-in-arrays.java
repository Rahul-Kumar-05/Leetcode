class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);

        int diff = 0;

        for(int i=1; i<arrays.size(); i++){

            diff = Math.max(diff, Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - min));
            diff = Math.max(diff, Math.abs(max - arrays.get(i).get(0)));

            min = Math.min(min, arrays.get(i).get(0));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size()-1));
        }

        return diff;
    }
}