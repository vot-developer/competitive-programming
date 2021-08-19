package edu.cp.data_structures.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparseTableTest {

    @Test
    void sum() {
        SparseTable sparseTable = new SparseTable(new int[]{3, 4, 2, 5, 1}, (a, b) -> a + b);
        assertEquals(7, sparseTable.query(0, 1));
        assertEquals(9, sparseTable.query(0, 2));
        assertEquals(6, sparseTable.query(1, 2));
        assertEquals(15, sparseTable.query(0, 4));
    }
}