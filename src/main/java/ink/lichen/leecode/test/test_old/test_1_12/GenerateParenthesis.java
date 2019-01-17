package ink.lichen.leecode.test.test_old.test_1_12;

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

    private void backtrack(List<String> res, String str, int open, int close, int max) {
        if (str.length() == max * 2 ){
            res.add(str);
            return;
        }
        if (open < max){
            backtrack(res,str+"(",open+1,close,max);
        }
        if (close < open){
            backtrack(res,str+")",open,close+1,max);
        }
    }


    public static void main(String[] args) {
        new GenerateParenthesis().generateParenthesis(3);
    }
}
