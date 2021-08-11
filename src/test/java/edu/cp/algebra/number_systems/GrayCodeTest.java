package edu.cp.algebra.number_systems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrayCodeTest {
    private GrayCode grayCode;

    @BeforeEach
    void setUp() {
        grayCode = new GrayCode();
    }

    @Test
    void get() {
        int g1 = grayCode.get(130);
        int g2 = grayCode.get(129);
        int diff = g1 ^ g2;
        int count = 0;
        for (; diff > 0; diff >>= 1)
            if ((diff & 1) == 1)
                count++;
        assertEquals(1, count);
    }

    @Test
    void inverse() {
        int g = grayCode.get(257);
        assertEquals(257, grayCode.inverse(g));
    }
}