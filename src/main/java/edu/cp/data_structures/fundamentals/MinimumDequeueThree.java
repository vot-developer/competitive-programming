package edu.cp.data_structures.fundamentals;

import java.util.Stack;

public class MinimumDequeueThree {
    private final Stack<int[]> insertStack;
    private final Stack<int[]> removeStack; // 0 - val, 1 - min

    public MinimumDequeueThree() {
        this.insertStack = new Stack<>();
        this.removeStack = new Stack<>();
    }

    //time - O(1)
    public void add(Integer a){
        int min = insertStack.isEmpty() ? a : Math.min(insertStack.peek()[1], a);
        insertStack.push(new int[]{a, min});
    }

    //average time - O(1)
    public Integer remove(){
        if (removeStack.isEmpty() && insertStack.isEmpty())
            return null;
        if (removeStack.isEmpty()) {
            while (!insertStack.isEmpty()) {
                int value = insertStack.pop()[0];
                int min = removeStack.isEmpty() ? value : Math.min(value, removeStack.peek()[1]);
                removeStack.push(new int[]{value, min});
            }
        }
        return removeStack.pop()[0];
    }

    public Integer min() {
        if (insertStack.isEmpty() && removeStack.isEmpty())
            return null;
        if (insertStack.isEmpty())
            return removeStack.peek()[1];
        if (removeStack.isEmpty())
            return insertStack.peek()[1];
        return Math.min(insertStack.peek()[1], removeStack.peek()[1]);
    }
}
