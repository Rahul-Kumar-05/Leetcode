class Solution {
    public class Pair{
        int dist;
        int node;

        public Pair(int dist, int node){
            this.dist = dist;
            this.node = node;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        
        List<List<int[]>> adj = new ArrayList<>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        for(int edge[] : times){
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];

            adj.get(u).add(new int[]{v, cost});
            // adj.get(v).add(new int[]{u, cost});
        }

        int distance[] = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.dist, b.dist));

        pq.add(new Pair(0, k));

        while(!pq.isEmpty()){
            Pair p = pq.poll();

            int d_u = p.dist;
            int u = p.node;

            if(distance[u] < d_u){
                continue;
            }

            for(int i=0; i<adj.get(u).size(); i++){
                int temp[] = adj.get(u).get(i);

                int v = temp[0];
                int c_u_v = temp[1];

                if(distance[v] > d_u + c_u_v){
                    distance[v] = d_u + c_u_v;

                    pq.add(new Pair(distance[v], v));
                }
            }
        }

        int max = 0;

        for(int i=1; i<=n; i++){
            max = Math.max(max, distance[i]);
        }


        if(max == Integer.MAX_VALUE){
            return -1;
        }

        return max;
    }
}