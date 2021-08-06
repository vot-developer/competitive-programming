package edu.cp.algebra.fundamentals;

/*
The greatest common divisor
 */
public class GCD {
    //time - like Fibonacci numbers - O(log min (a, b))
    public int gcd(int a, int b){
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    /*
    Least common multiple
     */
    public int lcm(int a, int b){
        return a / gcd(a, b) * b; // *b - at end for minimize overflow problems
    }
}
