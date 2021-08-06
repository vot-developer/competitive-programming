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
    }

    @Test
    void binPowMod() {
        assertEquals(881816282, binaryExponentiation.binPowMod(13, 27, 1_000_000_007));
    }
}