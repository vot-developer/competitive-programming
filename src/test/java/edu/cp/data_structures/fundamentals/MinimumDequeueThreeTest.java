package edu.cp.data_structures.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDequeueThreeTest {

    @Test
    void test() {
        MinimumDequeueThree dq = new MinimumDequeueThree();
        dq.add(3);
        assertEquals(3, dq.min());
        dq.add(1);
        assertEquals(1, dq.min());
        assertEquals(3, dq.remove());
        assertEquals(1, dq.min());
        dq.add(4);
        assertEquals(1, dq.min());
        assertEquals(1, dq.remove());
        assertEquals(4, dq.min());
    }

    @Test
    void test2() {
        MinimumDequeueThree dq = new MinimumDequeueThree();
        dq.add(2);
        dq.add(1);
        dq.add(3);
        assertEquals(1, dq.min());
        assertEquals(2, dq.remove());
        assertEquals(1, dq.min());
        assertEquals(1, dq.remove());
        assertEquals(3, dq.min());
    }
}