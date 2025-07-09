class Solution {

    static final int mod = (int)1e9 + 7;

    public class Pair{
        long dist;
        int node;

        public Pair(long dist, int node){
            this.dist = dist;
            this.node = node;
        }
    }

    public int countPaths(int n, int[][] roads) {
        
        List<List<long[]>> adj = new ArrayList<>();

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int edge[] : roads){
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];

            adj.get(u).add(new long[]{v, cost});
            adj.get(v).add(new long[]{u, cost});
        }

        long distance[] = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[0] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));

        pq.add(new Pair(0L, 0));

        int ways[] = new int[n];
        Arrays.fill(ways, 0);

        ways[0] = 1;

        while(!pq.isEmpty()){
            Pair p = pq.poll();

            long d_u = p.dist;
            int u = p.node;

            if(distance[u] < d_u){
                continue;
            }

            for(int i=0; i<adj.get(u).size(); i++){
                long temp[] = adj.get(u).get(i);

                int v = (int)temp[0];
                long c_u_v = temp[1];

                if(distance[v] > d_u + c_u_v){
                    distance[v] = d_u + c_u_v;
                    ways[v] = ways[u];

                    pq.add(new Pair(distance[v], (int)v));
                }

                else if(distance[v] == d_u + c_u_v){
                    ways[v] = (int)(ways[u] + ways[v]) % mod;
                }
            }
        }

        return ways[n-1];
    }
}