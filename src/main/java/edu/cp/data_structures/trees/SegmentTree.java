package edu.cp.data_structures.trees;

public class SegmentTree {
    private final int[] arr;
    private final int size;

    public SegmentTree(int[] input) {
        this.arr = new int[4 * input.length];
        this.size = input.length;
        build(input, 1, 0, input.length - 1);
    }

    public int sum(int l, int r){
        return sum(1, 0, size - 1, l, r);
    }

    public void update (int index, int value){
        update(1, 0, size - 1, index, value);
    }

    private int sum(int index, int tl, int tr, int l, int r) { //l, r - borders of required interval
        if (l > r)
            return 0;

        if (l == tl && r == tr)
            return arr[index];

        int mid = (tl + tr) / 2;
        return sum(index << 1, tl, mid, l, Math.min(r, mid))
            + sum((index << 1) + 1, mid + 1, tr, Math.max(l, mid + 1), r);
    }

    private void update(int index, int tl, int tr, int pos, int value){
        if (tl == tr)
            arr[index] = value;
        else {
            int mid = (tl + tr) / 2;
            if (pos <= mid)
                update (index << 1, tl, mid, pos, value);
            else
                update ((index << 1) + 1, mid + 1, tr, pos, value);
            arr[index] = arr[index << 1] + arr[(index << 1) + 1];
        }
    }

    private void build(int[] input, int index, int tl, int tr){
        if (tl == tr)
            arr[index] = input[tl];
        else {
            int mid = (tl + tr) / 2;
            build(input, index << 1, tl, mid);
            build(input, (index << 1) + 1, mid + 1, tr);
            arr[index] = arr[index << 1] + arr[(index << 1) + 1];
        }
    }
}
