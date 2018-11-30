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

    private Stack<Integer> mainStack;

    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.size() == 0 || minStack.peek() >= x ){
            minStack.push(x);
        }
    }

    public void pop() {
        int val = mainStack.pop();
        if (val == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
