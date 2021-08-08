package edu.cp.algebra.modular_arithmetic;

public class ModularInverse {

    /*
    Return inverse element to a (a ^ {-1}) for prime number - mod.
    Implementation's based on Fermat's little theorem (a^{m-1} = 1, by mod |m| and m - prime) and Binary Exponentiation alg.

    time - O(log a), space - O(1)
     */
    public long calculate(int a, int mod){
        return binExpPow(a, mod - 2, mod);
    }

    private long binExpPow(long a, long b, long m){
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}
