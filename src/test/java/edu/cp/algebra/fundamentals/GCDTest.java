package edu.cp.algebra.fundamentals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    private GCD gcd;

    @BeforeEach
    void setUp() {
        gcd = new GCD();
    }

    @Test
    void gcd() {
        assertEquals(3, gcd.gcd(18, 21));
        assertEquals(18, gcd.gcd(18, 0));
        assertEquals(1, gcd.gcd(17, 4));
    }

    @Test
    void lcm() {
        assertEquals(18, gcd.lcm(9, 6));
        assertEquals(0, gcd.lcm(1, 0));
        assertEquals(34, gcd.lcm(17, 2));
    }
}