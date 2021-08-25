package edu.cp.data_structures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountSegmentTreeTest {

    @Test
    void max() {
        MaxCountSegmentTree tree = new MaxCountSegmentTree(new int[]{1,2,1,2,1,2,1});
        assertEquals(2, tree.max(1, 4)[0]);
        assertEquals(2, tree.max(1, 4)[1]);
        tree.update(2, 3);
        assertEquals(3, tree.max(1, 4)[0]);
        assertEquals(1, tree.max(1, 4)[1]);
    }
}