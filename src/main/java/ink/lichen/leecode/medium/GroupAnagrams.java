package ink.lichen.leecode.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-9-6.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0){
            return res;
        }

        Map<char[],List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> list = map.get(chars);
            if (list == null){
                map.put(chars,new ArrayList<>());
                list = map.get(chars);
            }
            list.add(str);
        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
        Character a = 'a';
        Character b = 'a';
        Character c = 'a';
        System.out.println(a.hashCode());
    }


}
