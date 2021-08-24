package edu.cp.data_structures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegmentTreeTest {

    @Test
    void test() {
        SegmentTree tree = new SegmentTree(new int[]{1,2,3,4,5});

        assertEquals(7, tree.sum(2, 3));
        assertEquals(6, tree.sum(0, 2));

        tree.update(2, 1);
        assertEquals(5, tree.sum(2, 3));
        assertEquals(4, tree.sum(0, 2));
        tree.update(2, 3); //return value

        tree.update(0, 9);
        assertEquals(14, tree.sum(0, 2));
    }
}