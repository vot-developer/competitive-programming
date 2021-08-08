package edu.cp.algebra.fundamentals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryExponentiationTest {
    private BinaryExponentiation binaryExponentiation;

    @BeforeEach
    void setUp(){
        binaryExponentiation = new BinaryExponentiation();
    }

    @Test
    void binPow() {
        assertEquals(1594323l, binaryExponentiation.binPow(3, 13));
        assertEquals(131072l, binaryExponentiation.binPow(2, 17));
    }

    @Test
    void binPowRecursive() {
        assertEquals(1594323l, binaryExponentiation.binPowRecursive(3, 13));
        assertEquals(131072l, binaryExponentiation.binPowRecursive(2, 17));
    }

    @Test
    void binPowMod() {
        assertEquals(881816282, binaryExponentiation.binPowMod(13, 27, 1_000_000_007));
    }
}