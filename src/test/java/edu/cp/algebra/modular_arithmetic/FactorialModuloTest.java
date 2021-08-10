package edu.cp.algebra.modular_arithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialModuloTest {
    private FactorialModulo factorialModulo;

    @BeforeEach
    void setUp() {
        factorialModulo = new FactorialModulo();
    }

    @Test
    void factorial() {
        assertEquals(662, factorialModulo.factorial(13, 1_007));
        assertEquals(662, factorialModulo.factorialRec(13, 1_007));
        assertEquals(227020758, factorialModulo.factorialRec(13, 1_000_000_007));
    }
}