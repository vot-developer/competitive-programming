package edu.cp.data_structures.fundamentals;

import java.util.Deque;
import java.util.LinkedList;

/*
save and support add/remove/min operations (O(1)) on interval
 */
public class MinimumDequeueTwo {
    private final Deque<int[]> dq; //0 - val, 1 - index
    private int currIndex = 0;
    private int removeIndex = 0;

    public MinimumDequeueTwo() {
        this.dq = new LinkedList<>();
    }

    public void add(Integer a){
        while (!dq.isEmpty() && dq.peekLast()[0] > a)
            dq.pollLast();
        dq.offerLast(new int[]{a, currIndex++});
    }

    public void remove(){
        if (removeIndex == dq.peek()[1])
            dq.poll();
        removeIndex++;
    }

    public Integer min() {
        if (dq.isEmpty())
            return null;
        return dq.peek()[0];
    }
}
