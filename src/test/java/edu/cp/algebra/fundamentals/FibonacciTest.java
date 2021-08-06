package edu.cp.algebra.fundamentals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    void calculateNumber() {
        assertEquals(89, fibonacci.calculateNumber(11));
        assertEquals(2, fibonacci.calculateNumber(3));
        assertEquals(1, fibonacci.calculateNumber(1));
        assertEquals(4181, fibonacci.calculateNumber(19));
    }
}