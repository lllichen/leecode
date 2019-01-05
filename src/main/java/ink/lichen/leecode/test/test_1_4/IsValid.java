package ink.lichen.leecode.test.test_1_4;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2019-1-4.
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class IsValid {

    private char ret (char c){
        switch (c){
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';
            default:return ' ';
        }
    }

    public boolean isValid(String s) {
        int n = s.length();
        if ( n == 0){
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i < n ; i ++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if (c != ret(s.charAt(i))){
                    return false;
                }
            }
        }

        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
