package edu.cp.data_structures.trees;

public class TwoDimensionalFenwickTree {
    private final int[][] arr;
    private int m;
    private int n;

    //space - O(m*n)
    public TwoDimensionalFenwickTree(int m, int n) {
        this.arr = new int[m + 1][n + 1]; // + 1 for handle 0 index (problem with calculate without infinite loop - (i += i & -i))
        this.m = m + 1;
        this.n = n + 1;
    }

    //time - O(log m * log n)
    public void add(int y, int x, int value) {
        y++;
        x++;
        for (int i = y; i < m; i += i & -i)
            for (int j = x; j < n; j += j & -j)
                arr[i][j] += value;
    }

    //time - O(log m * log n)
    public int sum(int y, int x){
        y++;
        x++;
        int sum = 0;
        for (int i = y; i > 0; i -= i & -i)
            for (int j = x; j > 0; j -= j & -j)
                sum += arr[i][j];
        return sum;
    }

    //time - O(log m * log n)
    public int sum(int y1, int x1, int y2, int x2) {
        int a = sum(y2, x2);
        int b = sum(y1 - 1, x1 - 1);
        int c = sum(y2, x1 - 1);
        int d = sum(y1 - 1, x2);
        return a + b - c - d;
    }
}
