package ink.lichen.leecode.test.test_1_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2019-1-12.
 *
 * ((( )))
 * (()())
 *
 */
public class GenerateParenthesis {


    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }


    /**
     *  33
     *  32
     *  31
     *  30
     *  20
     *  10
     *  00
     *
     */
    public void backtrack(List<String> list, String str ,Integer open,Integer close, Integer max)
    {
        if (str.length() == 2*max){
            list.add(str);
            return;
        }
        if (open < max){
            String t = str +"(";
            backtrack(list,t,open+1,close,max);
        }
        if (close < open){
            String t = str +")";
            backtrack(list,t,open,close+1,max);
        }
    }

    public static void main(String[] args) {
        new GenerateParenthesis().generateParenthesis(3);
    }
}
