package edu.cp.data_structures.trees;

public class MaxCountSegmentTree {
    private final int[][] arr; // 0 - max, 1 - count
    private final int size;

    public MaxCountSegmentTree(int[] input){
        int n = input.length;
        this.arr = new int[4 * n][2];
        this.size = n;
        build(input, 1, 0, size - 1);
    }

    private int[] combine(int[] a, int[] b){
        if (a[0] > b[0])
            return a;
        if (b[0] > a[0])
            return b;
        return new int[]{a[0], a[1] + b[1]};
    }

    private void build(int[] input, int index, int tl, int tr){
        if (tl == tr) {
            arr[index][0] = input[tl];
            arr[index][1] = 1;
        } else {
            int mid = (tl + tr) / 2;
            build(input, index << 1, tl, mid);
            build(input, (index << 1) + 1, mid + 1, tr);

            arr[index] = combine(arr[index << 1], arr[(index << 1) + 1]);
        }
    }

    public int[] max(int l, int r){
        return max(1, 0, size - 1, l, r);
    }

    private int[] max(int index, int tl, int tr, int l, int r){
        if (l > r)
            return new int[]{Integer.MIN_VALUE, 0};
        if (tl == l && tr == r)
            return arr[index];

        int mid = (tl + tr) / 2;
        return combine(
            max(index << 1, tl, mid, l, Math.min(mid, r)),
            max((index << 1) + 1, mid + 1, tr, Math.max(mid + 1, l), r)
        );
    }

    public void update (int index, int value){
        update(1, 0, size - 1, index, value);
    }

    private void update(int index, int tl, int tr, int pos, int value){
        if (tl == tr)
            arr[index][0] = value;
        else {
            int mid = (tl + tr) / 2;
            if (pos <= mid)
                update (index << 1, tl, mid, pos, value);
            else
                update ((index << 1) + 1, mid + 1, tr, pos, value);
            arr[index] = combine(arr[index << 1], arr[(index << 1) + 1]);
        }
    }
}
