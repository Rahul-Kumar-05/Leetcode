class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lucky_number = -1;

        for(int key : map.keySet()){
            if(map.get(key) == key){
                lucky_number = Math.max(key, lucky_number);
            }
        }

        return lucky_number;
    }
}