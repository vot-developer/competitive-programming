package edu.cp.algebra.fundamentals;

public class Fibonacci {

    //time - O(log n)
    public int calculateNumber(int n){
        if (n <= 0)
            return 0;

        if (n < 3)
            return 1;

        //(F_0, F_1) * P ^ n-1 = (F_n-1, F_n);
        int[][] P = new int[][]{{0, 1}, {1, 1}};
        int[][] res = P; //n - 1
        n -= 3;
        while (n > 0){
            if ((n & 1) == 1)
                res = multiply(res, P);

            P = multiply(P, P);
            n >>= 1;
        }
        return res[0][1] + res[1][1];
    }

    private int[][] multiply(int[][] a, int[][] b) {
        int m = a.length;
        int n = b[0].length;
        int size = a[0].length;
        if (b.length != size)
            return null;

        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) //row
            for (int j = 0; j < n; j++) //cow
                for (int k = 0; k < size; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
        return result;
    }
}
