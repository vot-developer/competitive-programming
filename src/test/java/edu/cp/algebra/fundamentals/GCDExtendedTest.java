package edu.cp.algebra.fundamentals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDExtendedTest {
    private GCDExtended gcdExtended;

    @BeforeEach
    void setUp() {
        gcdExtended = new GCDExtended();
    }

    @Test
    void gcd1() {
        int[] result = gcdExtended.gcd(30, 20);
        int gcd = result[0];
        int x = result[1];
        int y = result[2];
        assertEquals(10, gcd);
        assertEquals(1, x);
        assertEquals(-1, y);
    }

    @Test
    void gcd2() {
        int[] result = gcdExtended.gcd(35, 15);
        int gcd = result[0];
        int x = result[1];
        int y = result[2];
        assertEquals(5, gcd);
        assertEquals(1, x);
        assertEquals(-2, y);
    }
}