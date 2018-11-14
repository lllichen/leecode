package ink.lichen.leecode.tx;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-11-14.
 */
public class MinStack {


    private Stack<Pair> st = new Stack<>();    // top of stack
    private int min = Integer.MAX_VALUE;


    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        min= Math.min(x, min);
        st.push(new Pair(x, min));
    }

    public void pop() {
        if(!st.isEmpty()) {
            st.pop();
        }
        if(!st.isEmpty()) {
            min= st.peek().min;
        }
        else
            min= Integer.MAX_VALUE;
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().min;
    }

    class Pair {
        int val;
        int min;
        public Pair(int val, int min) {
            this.val = val; this.min = min;
        }
    }
}
