package edu.cp.data_structures.fundamentals;

import java.util.function.BiFunction;

public class SparseTable {

    private final int n;
    private final int [][] st; //ans[i][j] - answer for interval [i, i + 2^j - 1]
    private final BiFunction<Integer, Integer, Integer> function;


    public SparseTable(int arr[], BiFunction<Integer, Integer, Integer> function) {
        this.n = arr.length;
        int k = (int) (Math.log(n) / Math.log(2)); //log_2(n) = log_e(n)/log_e(2)
        this.st = new int[n][k + 1];
        this.function = function;

        // initialize intervals with length 1
        for (int i = 0; i < n; i++)
            st[i][0] = arr[i];

        // Compute values from smaller to bigger intervals
        for (int j = 1; (1 << j) <= n; j++) {
            // Compute function value for all intervals with
            // size 2^j
            for (int i = 0; (i + (1 << j) - 1) < n; i++)
                st[i][j] = function.apply(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);
        }
    }

    int query(int l, int r) {
        int k = (int) (Math.log(r - l + 1) / Math.log(2));

        int ans = 0;
        for (int j = k; j >= 0; j--) {
            if ((1 << j) <= r - l + 1){
                ans = function.apply(ans, st[l][j]);
                l += 1 << j;
            }
        }
        return ans;
    }

    // Driver program
    public static void main (String[] args)
    {
        int arr[] = { 7, 2, 3, 0, 5, 10, 3, 12, 18 };

        SparseTable sparseTable = new SparseTable(arr, (a, b) -> Integer.min(a, b));

        System.out.println(sparseTable.query(0, 4));
        System.out.println(sparseTable.query(4, 7));
        System.out.println(sparseTable.query(7, 8));
        System.out.println(sparseTable.query(0, 8));

    }
}
