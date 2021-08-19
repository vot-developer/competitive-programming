package edu.cp.data_structures.trees;

public class DisjointSetUnion {

    private final int[] parent;
    private final int[] weight;

    public DisjointSetUnion(int size) {
        parent = new int[size];
        weight = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public void union(int a, int b) {
        int rootA = findRoot(a);
        int rootB = findRoot(b);

        if (rootA == rootB)
            return;

        if (weight[rootA] >= weight[rootB]) {
            parent[rootB] = parent[rootA];
            weight[rootA]++;
        } else {
            parent[rootA] = parent[rootB];
            weight[rootB]++;
        }
    }

    public boolean isConnected(int a, int b) {
        if (findRoot(a) == findRoot(b))
            return true;

        return false;
    }

    private int findRoot(int i) {
        while (parent[i] != i) {
            parent[i] = parent[parent[i]]; //time -> O(log* n) -> a(n) (inverse Ackermann function)
            i = parent[i];
        }
        return i;
    }
}
