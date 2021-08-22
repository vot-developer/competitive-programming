package edu.cp.data_structures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FenwickTreeTest {

    @Test
    void test() {
        FenwickTree fenwickTree = new FenwickTree(9);
        fenwickTree.add(6, 6);
        fenwickTree.add(4, 4);
        assertEquals(10, fenwickTree.sum(8));
        assertEquals(4, fenwickTree.sum(5));
        fenwickTree.add(5, 5);
        assertEquals(15, fenwickTree.sum(8));
        assertEquals(9, fenwickTree.sum(5));
        fenwickTree.add(0, 1);
        assertEquals(16, fenwickTree.sum(8));
        assertEquals(10, fenwickTree.sum(5));
        assertEquals(11, fenwickTree.sum(5, 8)); //5,6
    }
}