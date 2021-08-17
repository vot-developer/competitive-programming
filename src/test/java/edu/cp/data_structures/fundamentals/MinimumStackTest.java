package edu.cp.data_structures.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumStackTest {

    @Test
    void push() {
        MinimumStack stack = new MinimumStack();
        stack.push(3);
        assertEquals(3, stack.min());
        stack.push(1);
        assertEquals(1, stack.min());
        stack.pop();
        assertEquals(3, stack.min());
    }
}