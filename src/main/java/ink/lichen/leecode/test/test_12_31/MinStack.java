package ink.lichen.leecode.test.test_12_31;

import java.util.Stack;

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
        if (minStack.isEmpty()  || minStack.peek() >= x){
            minStack.push(x);
        }
    }

    public void pop() {
            Integer val = mainStack.pop();
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
