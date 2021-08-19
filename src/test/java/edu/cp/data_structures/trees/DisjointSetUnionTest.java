package edu.cp.data_structures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisjointSetUnionTest {

    @Test
    void union() {
        DisjointSetUnion dsu = new DisjointSetUnion(5);
        assertFalse(dsu.isConnected(0, 4));
        dsu.union(0, 2);
        dsu.union(1, 3);
        dsu.union(3, 4);
        dsu.union(1, 2);
        assertTrue(dsu.isConnected(0, 4));
    }
}