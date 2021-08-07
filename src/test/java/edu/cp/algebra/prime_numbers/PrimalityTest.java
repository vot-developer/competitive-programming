package edu.cp.algebra.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimalityTest {
    private Primality primality;

    @BeforeEach
    void setUp(){
        primality = new Primality();
    }

    @Test
    void testTrialDivision() {
        assertTrue(primality.testTrialDivision(17));
        assertFalse(primality.testTrialDivision(27));
    }
}