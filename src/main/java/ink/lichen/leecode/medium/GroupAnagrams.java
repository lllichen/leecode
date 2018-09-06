package ink.lichen.leecode.medium;

import java.util.ArrayList;
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

        Map<Set<Character>,List<String>> map = new HashMap<>();

        for ( String str : strs){
            Set<Character> characters = new HashSet<>();
            for (Character character : str.toCharArray()){
                characters.add(character);
            }

            if (map.get(characters) == null){
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(characters,list);
            }else {
                List<String> list = map.get(characters);
                if (!list.contains(str)){
                    list.add(str);
                }
                map.put(characters,list);
            }
        }
        res.addAll(map.values());
        return res;
    }
}
