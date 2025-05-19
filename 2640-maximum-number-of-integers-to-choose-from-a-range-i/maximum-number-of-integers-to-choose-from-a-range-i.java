class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        // HashSet<Integer> set = new HashSet<>();

        // for(int ban : banned){
        //     set.add(ban);
        // }

        int freq[] = new int[10001];

        int j=0;
        for(int i=0; i<banned.length; i++){
            freq[banned[j]]++;
            j++;
        }

        int count = 0;
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(freq[i] >=1) continue;

            sum = sum + i;
            if(sum > maxSum) break;
            
            count++;
        }

        return count;
    }
}