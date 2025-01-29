class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        
        // Initialize each node as its own parent
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            int parentU = find(parent, u);
            int parentV = find(parent, v);
            
            // If both nodes have the same parent, this edge forms a cycle
            if (parentU == parentV) {
                return edge;
            }
            
            // Union the two sets
            parent[parentV] = parentU;
        }
        
        return new int[0]; // No redundant edge found (should not happen as per problem statement)
    }
    
    private int find(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = find(parent, parent[node]); // Path compression
        }
        return parent[node];
    }
}