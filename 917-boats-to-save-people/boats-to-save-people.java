class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int res = 0;

        int left = 0; 
        int right = people.length-1;

        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            res++;
        }

        return res;
    }
}