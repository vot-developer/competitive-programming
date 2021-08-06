package edu.cp.algebra.fundamentals;

public class GCDExtended {

    /*
        a * x + b * y = gcd(a,b)
        return :
        0 - gcd
        1 - x
        2 - y
     */
    public int[] gcd(int a, int b){
        if (b == 0)
            return new int[]{a, 1, 0};

        int[] result = gcd(b, a % b);
        int x1 = result[1], y1 = result[2], gcd = result[0];
        int x = y1;
        int y = x1 - y1 * (a / b);
        return new int[]{gcd, x, y};
    }

}
