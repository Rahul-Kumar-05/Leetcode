class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // ArrayList<Character> list = new ArrayList<>();

        // int i = 0;
        // int j = 0;

        // int max = 0;
        // int count = 0;

        // while(i<s.length()-max && j<s.length()){

        //     if(list.contains(s.charAt(j))){
        //         max = Math.max(max, count);
        //         count = 0;
        //         i++;
        //         j = i;
        //         list.clear();
        //     }
        //     else{
        //         list.add(s.charAt(j));
        //         count++;
        //         j++;
        //     }
        // }

        // return Math.max(max, count);

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;

        int max = 0;
        int count = 0;

        for(int i=right; i<s.length(); i++){
            
            char c = s.charAt(i);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                count--;
            }

            set.add(c);
            right++;
            count = right - left;
            max = Math.max(max, count);
        }

        return max;
    }
}