package edu.cp.data_structures.fundamentals;

import java.util.Stack;

/*
stack with opportunity to get actual min - O(1) at any time
 */
public class MinimumStack {

    private final Stack<int[]> stack; //0 - val, 1 - min

    public MinimumStack() {
        this.stack = new Stack<>();
    }

    //time - O(1)
    public void push(Integer a){
        int min = a;
        if (!stack.isEmpty() && stack.peek()[1] < a)
            min = stack.peek()[1];
        stack.push(new int[]{a, min});
    }

    public Integer pop(){
        if (!stack.isEmpty())
            return stack.pop()[0];
        return null;
    }

    public Integer min(){
        if (!stack.isEmpty())
            return stack.peek()[1];
        return null;
    }
}
