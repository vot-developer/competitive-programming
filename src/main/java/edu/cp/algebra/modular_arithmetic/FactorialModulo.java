package edu.cp.algebra.modular_arithmetic;

public class FactorialModulo {

    //n! % p = 1*2*3..*(p-1)*p*(p+1)*...*2p*..*(p^2-1)*p^2*(p^2+1)..*n
    //n! % p = 1*2*3..*(p-1)*1*2*..*(p-1)*1*.. *(p-1)..*1*2*...      *(n%p)
    //n! % p =         (p-1)!*..   *(p-1)!*    *(p-1)!*...   *(n%p)!
    //n! % p = (p-1)! ^ (n / p) * (n%p)! (mod p)

    // (p-1)! % p = -1 (Wilson theorem when p - prime) and (-1 mod p) = (p-1)
    //n! % p =
    // if n/p % 2 = 0 :  1 * (n%p)! (mod p)
    // if n/p % 2 = 1 :  (p - 1) * (n%p)! (mod p)

    //time - O(p + log_p(n)), space - O(p)
    public int factorial(int n, int p) {
        long[] f = new long[p];
        f[0] = 1;
        for (int i = 1; i < p; i++)
            f[i] = f[i - 1] * i % p; //precalculate all factorials for 0..(p-1)

        long res = 1;
        while (n > 1) {
            if ((n / p) % 2 == 1)
                res *= p - 1;
            res = res * f[n % p] % p;
            n /= p;
        }
        return (int) res;
    }

    //time - O(p * log_p(n)) - space O(1)
    public int factorialRec(int n, int p) {
        long res = 1;
        while (n > 1) {
            res = (res * ((n / p) % 2 == 1 ? p - 1 : 1)) % p;
            for (int i = 2; i <= n % p; ++i)
                res = (res * i) % p;
            n /= p;
        }
        return (int) (res % p);
    }
}
