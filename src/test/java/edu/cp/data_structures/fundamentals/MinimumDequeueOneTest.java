package edu.cp.data_structures.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDequeueOneTest {

    @Test
    void add() {
        MinimumDequeueOne dq = new MinimumDequeueOne();
        dq.add(1);
        assertEquals(1, dq.min());
        dq.add(4);
        assertEquals(1, dq.min());
        dq.add(3);
        assertEquals(1, dq.min());
        dq.remove(1);
        assertEquals(3, dq.min());
    }
}