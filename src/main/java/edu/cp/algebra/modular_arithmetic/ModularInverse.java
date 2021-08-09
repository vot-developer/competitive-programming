package edu.cp.algebra.modular_arithmetic;

public class ModularInverse {

    /*
    Return inverse element to a (a ^ {-1}) for prime number - mod.
    Implementation's based on Fermat's little theorem (a^{m-1} = 1, by mod |m| and m - prime) and Binary Exponentiation alg.

    time - O(log a), space - O(1)
     */
    public int calculate(int a, int mod){
        return binExpPow(a, mod - 2, mod);
    }

    private int binExpPow(int a, int b, int m){
        long res = 1;
        long acc = a % m;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * acc % m;
            acc = acc * acc % m;
            b >>= 1;
        }
        return (int) res;
    }
}
