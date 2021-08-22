package edu.cp.data_structures.trees;

public class FenwickTree {
    private final int[] arr;

    //space - O(n)
    public FenwickTree(int n) {
        this.arr = new int[n];
    }

    //time - O(log n)
    public void add(int index, int value) {
        if (index == 0) {
            arr[0] += value;
            return;
        }

        for (int i = index; i < arr.length; i += i & -i)
            arr[i] += value;
    }

    //time - O(log n)
    public int sum(int index){
        int sum = arr[0];
        for (int i = index; i > 0; i -= i & -i)
            sum += arr[i];
        return sum;
    }

    //time - O(log n)
    public int sum(int indexLeft, int indexRight){
        return sum(indexRight) - sum(indexLeft - 1);
    }
}
