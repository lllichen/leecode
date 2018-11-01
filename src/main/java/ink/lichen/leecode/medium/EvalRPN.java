package ink.lichen.leecode.medium;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 *
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式
 *
 * 输入: ["2", "1", "+", "3", "*"]
 * 输出: 9
 * 解释: ((2 + 1) * 3) = 9
 * ["0","3","/"]
 */
public class EvalRPN {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int ret = 0;
        for (int i = 0 ; i < tokens.length; i++){
            switch (tokens[i]){
                case "+":{
                    Integer val1 = Integer.valueOf(stack.pop());
                    Integer val2 = Integer.valueOf(stack.pop());
                    int val = val2+val1;
                    stack.push(String.valueOf(val));
                    break;
                }
                case "-":{
                    Integer val1 = Integer.valueOf(stack.pop());
                    Integer val2 = Integer.valueOf(stack.pop());
                    int val = val2-val1;
                    stack.push(String.valueOf(val));
                    break;
                }
                case "*": {
                    Integer val1 = Integer.valueOf(stack.pop());
                    Integer val2 = Integer.valueOf(stack.pop());
                    int val = val2*val1;
                    stack.push(String.valueOf(val));
                    break;
                }
                case "/": {
                    Integer val1 = Integer.valueOf(stack.pop());
                    Integer val2 = Integer.valueOf(stack.pop());
                    int val = val2/val1;
                    stack.push(String.valueOf(val));
                    break;
                }

                default:stack.push(tokens[i]);
            }
        }
        return Integer.valueOf(stack.pop());
    }


    public static void main(String[] args) {
        EvalRPN evalRPN = new EvalRPN();
        System.out.println(evalRPN.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}
