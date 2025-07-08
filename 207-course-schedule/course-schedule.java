class Solution {

    public static int topo(int edges[][], int v){
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

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);

            for(int adjNode : adj.get(node)){
                indegree[adjNode]--;

                if(indegree[adjNode] == 0){
                    q.offer(adjNode);
                }
            }
        }

        return ans.size();
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int topoSize = topo(prerequisites, numCourses);

        if(numCourses == topoSize){
            return true;
        }

        return false;
    }
}