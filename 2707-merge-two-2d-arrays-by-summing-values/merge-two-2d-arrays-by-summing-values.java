class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        List<int[]> res = new LinkedList<>();

        int p1 = 0;
        int p2 = 0;

        int n = nums1.length;
        int m = nums2.length;

        while(p1 < n && p2 < m){

            if(nums1[p1][0] == nums2[p2][0]){
                res.add(new int[]{nums1[p1][0], nums1[p1][1] + nums2[p2][1]});
                p1++;
                p2++;
            }

            else if(nums1[p1][0] < nums2[p2][0]){
                res.add(nums1[p1]);
                p1++;
            }

            else{
                res.add(nums2[p2]);
                p2++;
            }
        }

        while(p1 < n){
            res.add(nums1[p1]);
            p1++;
        }

        while(p2 < m){
            res.add(nums2[p2]);
            p2++;
        }

        int result[][] = new int[res.size()][2];

        for(int i=0; i<res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
    }
}