package edu.cp.algebra.number_systems;

/*
    Gray code is a binary numeral system where two successive values differ in only one bit.
 */
public class GrayCode {

    public int get(int n){
        return n ^ (n >> 1);
    }

    public int inverse(int g){
        int n = 0;
        for (; g > 0; g >>= 1)
            n ^= g;
        return n;
    }
}
