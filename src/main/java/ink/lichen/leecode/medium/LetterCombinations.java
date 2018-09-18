package ink.lichen.leecode.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-9-18.
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");


        return null;
    }
}
