class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int res[] = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            
            int idx = 0;
            for(int k=0; k<nums2.length; k++){
                if(nums2[k] == nums1[i]){
                    idx = k;
                    break;
                }
            }

            int nextmax = -1;
            for(int j=idx; j<nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    nextmax = nums2[j];
                    break;
                }
            }
            res[i] = nextmax;
        }

        return res;
    }
}