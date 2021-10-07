package edu.cp.data_structures.trees;

public class SegmentTreeNode {
    private final SegmentNode root;

    public SegmentTreeNode(int[] arr) {
        this.root = build(0, arr.length - 1, arr);
    }

    public void update(int index, int val) {
        update(index, val, root);
    }

    public int sum(int l, int r) {
        return sum(l, r, root);
    }

    private int sum(int l, int r, SegmentNode node) {
        if (l > node.r || r < node.l)
            return 0;

        if (l == node.l && r == node.r)
            return node.val;

        int mid = (node.l + node.r) / 2;

        return sum(l, Math.min(r, mid), node.left) + sum(Math.max(l, mid + 1), r, node.right);
    }

    private void update(int index, int val, SegmentNode node){
        if (index < node.l || index > node.r)
            return;

        if (node.l == node.r && node.l == index){
            node.val = val;
            return;
        }

        int mid = (node.l + node.r) / 2;
        if (index <= mid){
            update(index, val, node.left);
        } else {
            update(index, val, node.right);
        }

        node.val = node.left.val + node.right.val;
    }

    private SegmentNode build(int l, int r, int[] arr){
        SegmentNode node = new SegmentNode(l, r);
        if (l == r) {
            node.val = arr[l];
        } else {
            int mid = (l + r) / 2;
            node.left = build(l, mid, arr);
            node.right = build(mid + 1, r, arr);
            node.val = node.left.val + node.right.val;
        }
        return node;
    }
}

class SegmentNode {
    int l;
    int r;
    SegmentNode left;
    SegmentNode right;
    int val;

    public SegmentNode(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

