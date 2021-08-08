package edu.cp.algebra.modular_arithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModularInverseTest {
    private ModularInverse modularInverse;

    @BeforeEach
    void setUp(){
        modularInverse = new ModularInverse();
    }

    @Test
    void calculate() {
        assertEquals(4, modularInverse.calculate(3, 11));
        assertEquals(12, modularInverse.calculate(10, 17));
    }
}