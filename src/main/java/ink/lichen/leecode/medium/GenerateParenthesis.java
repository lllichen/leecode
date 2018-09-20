package ink.lichen.leecode.medium;

import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-9-20.
 */
public class GenerateParenthesis {


    private String add1(String val){
        return val+"()";
    }

    private String add2(String val){
        return "()"+val;
    }

    private String add3(String val){
        return "("+val+")";
    }



    public List<String> generateParenthesis(int n) {

        String start = "";

        return null;
    }

    public void help(int i,int z, List<String> result, String val, int n){
        if (i == n){
            return;
        }else {
            add1(val);
        }
    }
}
