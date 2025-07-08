class Solution {
    public static List<Integer> topo(int edges[][], int v){

        int indegree[] = new int[v];

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }

        for(int edge[] : edges){
            adj.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<v; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        List<Integer> res = new ArrayList<>();

        while(!q.isEmpty()){
            int node = q.poll();

            res.add(node);

            for(int adjNode : adj.get(node)){
                indegree[adjNode]--;

                if(indegree[adjNode] == 0){
                    q.offer(adjNode);
                }
            }
        }

        return res;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<Integer> res = new ArrayList<>();

        res = topo(prerequisites, numCourses);
        
        if(res.size() != numCourses){
            return new int[]{};
        }

        int ans[] = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            ans[i] = res.get(i);
        }

        int left = 0;
        int right = numCourses-1;

        while(left < right){
            int temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;

            left++;
            right--;
        }

        return ans;
    }
}