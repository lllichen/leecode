package ink.lichen.leecode.test.test_1_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2019-1-12.
 */
public class GenerateParenthesis {


    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        help(res,"",0,n);
        return res;
    }

    public void help(List<String> res,String str,int i, int n){
        if (str.length() == 2*n){
            res.add(str);
        }

    }

}
