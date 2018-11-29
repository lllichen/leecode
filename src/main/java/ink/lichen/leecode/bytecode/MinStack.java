package ink.lichen.leecode.bytecode;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-11-29.
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 */
public class MinStack {


    private Stack<Pair> st = new Stack<>();    // top of stack

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (st.isEmpty()){
            st.push(new Pair(x, x));
        }else {
            int min = st.peek().min;
            st.push(new Pair(x,Math.min(x,min)));
        }
    }

    public void pop() {
        if(!st.isEmpty()) {
            st.pop();
        }
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
