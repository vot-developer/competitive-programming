package edu.cp.algebra.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesSieveTest {
    private EratosthenesSieve sieve;

    @BeforeEach
    void setUp() {
        sieve = new EratosthenesSieve();
    }

    @Test
    void countPrimeNumbers() {
        assertEquals(5, sieve.countPrimeNumbers(11));
        assertEquals(11, sieve.countPrimeNumbers(31));
    }
}