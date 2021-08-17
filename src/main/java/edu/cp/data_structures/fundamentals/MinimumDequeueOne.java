package edu.cp.data_structures.fundamentals;

import java.util.Deque;
import java.util.LinkedList;

/*
save and support add/remove/min operations (O(1)) on interval
 */
public class MinimumDequeueOne {
    private final Deque<Integer> dq;

    public MinimumDequeueOne() {
        this.dq = new LinkedList<>();
    }

    public void add(Integer a){
        while (!dq.isEmpty() && dq.peekLast() > a)
            dq.pollLast();
        dq.offerLast(a);
    }

    public void remove(Integer a){ //strange remove with value
        if (!dq.isEmpty() && dq.peek() == a)
            dq.poll();
    }

    public Integer min() {
        return dq.peek();
    }
}
