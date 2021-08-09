package edu.cp.algebra.fundamentals;

public class BinaryExponentiation {

    /**
     * Returns the value of the first argument raised to the power of the second argument
     * time - O(log b), space - O(1)
     */
    public long binPow(long a, long b){
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a;
            a *= a;
            b >>= 1;
        }
        return res;
    }

    //time - O(log b), space - O(log n)
    public long binPowRecursive(long a, long b){
        if (b == 0)
            return 1;

        long res = binPowRecursive(a, b / 2);
        res *= res;
        if ((b & 1) == 1)
            res *= a;

        return res;
    }

    /**
     * Returns the value of the first argument raised to the power of the second argument by mod m
     * time - O(log b), space - O(1)
     */
    public int binPowMod(int a, int b, int m){
        long res = 1;
        long acc = a % m;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * acc) % m;
            acc = (acc * acc) % m;
            b >>= 1;
        }
        return (int) res;
    }
}
