class Solution {

    private int[] parent;
    private int[] rank;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Edge case
        if (source == destination) return true;

        // 1. Initialize DSU
        parent = new int[n];
        rank   = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;   // each node is its own parent
            rank[i]   = 0;
        }

        // 2. Union all edges
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }

        // 3. Check if source & destination share the same root
        return find(source) == find(destination);
    }

    // Find with PATH COMPRESSION — flattens tree on every lookup
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // 🔑 compress path
        }
        return parent[x];
    }

    // Union with UNION BY RANK — always attach smaller tree under larger
    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return; // already in same component

        // 🔑 attach lower rank tree under higher rank tree
        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;           // only grows when ranks are equal
        }
    }
}