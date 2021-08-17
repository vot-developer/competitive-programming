package edu.cp.data_structures.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDequeueTwoTest {

    @Test
    void test() {
        MinimumDequeueTwo dq = new MinimumDequeueTwo();
        dq.add(2);
        assertEquals(2, dq.min());
        dq.add(1);
        assertEquals(1, dq.min());
        dq.add(3);
        assertEquals(1, dq.min());
        dq.remove(); //remove 2
        assertEquals(1, dq.min());
        dq.remove(); //remove 1
        assertEquals(3, dq.min());
    }
}