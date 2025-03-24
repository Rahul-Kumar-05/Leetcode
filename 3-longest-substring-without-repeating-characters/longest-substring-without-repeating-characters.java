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

        int max = 0;
        int count = 0;

        for(int right=0; right<s.length(); right++){
            
            char c = s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                count--;
            }

            set.add(c);
            count = right - left + 1;
            max = Math.max(max, count);
        }

        return max;
    }
}