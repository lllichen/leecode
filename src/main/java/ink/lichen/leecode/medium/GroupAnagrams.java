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

        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String skey = new String(chars);
            List<String> list = map.get(skey);
            if (list == null){
                map.put(skey,new ArrayList<>());
                list = map.get(skey);
            }
            list.add(str);
        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
       String []str = new String[] {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams ga = new GroupAnagrams();
        List res = ga.groupAnagrams(str);
//        char[] a = new char[] {'a','e','t'};
//        char[] b = new char[] {'t','e','a'};
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        Arrays.sort(a);
//        Arrays.sort(b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

    }


}
