class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        HashSet<Integer> same = new HashSet<>();
        
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                same.add(nums2[i]);
            }
        }
        
        int len = same.size();
        int res[] = new int[len];
        int i = 0;

        for(int num : same){
            res[i] = num;
            i++;
        }

        return res;
    }
}