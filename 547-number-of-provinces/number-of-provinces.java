class Solution {

    public static int find(int x, int parent[]){
        if(x == parent[x]){
            return x;
        }

        return parent[x] = find(parent[x], parent);
    }

    public boolean union(int x, int y, int parent[], int rank[]){
        
        int parent_x = find(x, parent);
        int parent_y = find(y, parent);

        if(parent_x == parent_y){
            return false;
        }

        if(rank[parent_x] > rank[parent_y]){
            parent[parent_y] = parent_x;
        }

        else if(rank[parent_x] < rank[parent_y]){
            parent[parent_x] = parent_y;
        }

        else{
            parent[parent_x] = parent_y;
            rank[parent_y]++;
        }

        return true;
    }

    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;

        int parent[] = new int[n];
        int rank[] = new int[n];

        for(int i=0; i<n; i++){
            parent[i] = i;
            rank[i] = 0;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                if(isConnected[i][j] == 1){
                    union(i, j, parent, rank);
                }
            }
        }

        // count unique proviences
        int proviences = 0;

        for(int i=0; i<n; i++){
            if(parent[i] == i){
                proviences++;
            }
        }

        return proviences;
    }
}