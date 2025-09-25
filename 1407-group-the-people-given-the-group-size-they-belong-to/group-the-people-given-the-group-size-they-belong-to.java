class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int id = 0;

        for(int i : groupSizes){
            
            if(!map.containsKey(i)){
                map.put(i, new ArrayList<>());
            }

            map.get(i).add(id++);

            if(i == map.get(i).size()){
                res.add(map.get(i));
                map.remove(i);
            }
        }

        return res;
    }
}