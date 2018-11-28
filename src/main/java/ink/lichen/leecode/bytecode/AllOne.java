package ink.lichen.leecode.bytecode;

import java.util.HashMap;
import java.util.Map;

public class AllOne {

    private Map<String,Integer> map;

    private Integer maxVal;

    private String maxKey;

    private Integer minVal;

    private String minKey;

    /** Initialize your data structure here. */
    public AllOne() {
        map = new HashMap<>();
        maxKey = "";
        maxVal = 0;
        minKey = "";
        minVal = 0;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        Integer val = map.getOrDefault(key,0)+1;
        if (maxVal < val){
            maxVal = val;
            maxKey = key;
        }
        if (minVal > val){
            minVal = val;
            minKey = key;
        }

        map.put(key,val);
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if(!map.containsKey(key)){
            return;
        }
        Integer val = map.get(key);
        val = val -1;
        if (minVal > val){
            minVal = val;
            minKey = key;
        }

        map.put(key,val);

    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if (map.isEmpty()){
            return "";
        }
        return maxKey;
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if (map.isEmpty()){
            return "";
        }
        return minKey;
    }

}
