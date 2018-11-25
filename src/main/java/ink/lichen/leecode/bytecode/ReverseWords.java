package ink.lichen.leecode.bytecode;

import java.util.Stack;

public class ReverseWords {


    public String reverseWords(String s) {

        int n = s.length();
        if (n <= 0){
            return "";
        }
        if (n == 1){
            return s.trim();
        }
        s= s.trim();
        String [] strings = s.split(" ");
        if (strings.length == 1){
            return s;
        }

        Stack<String> stack = new Stack();
        for (String val : strings){
            val = val.trim();
            if (val.length() != 0){
                stack.push(val);
            }
        }
        StringBuilder sb = new StringBuilder();
        int sz = stack.size();
        for (int i = 0 ; i < sz; i++){
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1);

    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println("result is :"+reverseWords.reverseWords(" "));
    }


}
