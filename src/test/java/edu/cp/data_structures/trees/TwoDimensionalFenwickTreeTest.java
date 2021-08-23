package edu.cp.data_structures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimensionalFenwickTreeTest {

    @Test
    void test() {
        TwoDimensionalFenwickTree tree = new TwoDimensionalFenwickTree(2, 3);
        /*
        1, 2, 3
        4, 5, 6
         */
        tree.add(0, 0, 1);
        tree.add(0, 1, 2);
        tree.add(0, 2, 3);
        tree.add(1, 0, 4);
        tree.add(1, 1, 5);
        tree.add(1, 2, 6);
        assertEquals(21, tree.sum(1, 2));
        assertEquals(3, tree.sum(0, 1));
        assertEquals(16, tree.sum(0, 1, 1, 2));
        assertEquals(7, tree.sum(0, 1, 1, 1));
        assertEquals(5, tree.sum(1, 1, 1, 1)); //single value
    }
}