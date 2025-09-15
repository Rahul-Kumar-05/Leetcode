class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int temp[] = new int[A.length];

        int res = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == B[i]){
                res += 1;

                temp[i] = res;

                setA.add(A[i]);
                setB.add(B[i]);

                continue;
            }

            setA.add(A[i]);
            setB.add(B[i]);

            if(setA.contains(B[i])){
                res += 1;
            }

            if(setB.contains(A[i])){
                res += 1;
            }

            temp[i] = res;
        }

        return temp;
    }
}