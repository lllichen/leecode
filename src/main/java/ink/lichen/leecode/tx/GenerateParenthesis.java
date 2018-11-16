package ink.lichen.leecode.tx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-15.
 * 3
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * 思路: //open < max;close < open length = 2*max;
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
//        List<String> list = new ArrayList<String>();
//        backtrack(list, "", 0, 0, n);
//        return list;
        List<String> res = new ArrayList<>();

        backtrack(res,"",0,0,n);

        return res;
    }


    public void backtrack(List<String> list, String str ,Integer open,Integer close, Integer max)
    {
        if (str.length() == max*2){
            list.add(str);
            return;
        }

        if (open < max){
            backtrack(list,str+"(",open+1,close,max);
        }
        if (close < open){
            backtrack(list,str+")",open,close+1,max);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis g = new GenerateParenthesis();
        System.out.println(g.generateParenthesis(3));
    }

























//    public void backtrack(List<String> list, String str, int open, int close, int max){
//
//        if(str.length() == max*2){
//            list.add(str);
//            return;
//        }
//
//        if(open < max)
//            backtrack(list, str+"(", open+1, close, max);
//        if(close < open)
//            backtrack(list, str+")", open, close+1, max);
//    }
}
