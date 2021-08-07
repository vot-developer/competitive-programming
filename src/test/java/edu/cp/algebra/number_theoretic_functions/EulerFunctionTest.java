package edu.cp.algebra.number_theoretic_functions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EulerFunctionTest {
    private EulerFunction eulerFunction;

    @BeforeEach
    void setUp(){
        eulerFunction = new EulerFunction();
    }

    @Test
    void calculate() {
        assertEquals(12, eulerFunction.calculate(13));
        assertEquals(4, eulerFunction.calculate(12));
        assertEquals(96, eulerFunction.calculate(97));
        assertEquals(60, eulerFunction.calculate(99));
    }
}