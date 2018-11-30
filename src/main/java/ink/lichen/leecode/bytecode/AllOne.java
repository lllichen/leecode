package ink.lichen.leecode.bytecode;

import sun.plugin.javascript.navig.Link;

import java.util.*;

/**
 *
 * 实现一个数据结构支持以下操作：
 *
 * Inc(key) - 插入一个新的值为 1 的 key。或者使一个存在的 key 增加一，保证 key 不为空字符串。
 *
 * Dec(key) - 如果这个 key 的值是 1，那么把他从数据结构中移除掉。否者使一个存在的 key 值减一。
 * 如果这个 key 不存在，这个函数不做任何事情。key 保证不为空字符串。
 *
 * GetMaxKey() - 返回 key 中值最大的任意一个。如果没有元素存在，返回一个空字符串""。
 *
 * GetMinKey() - 返回 key 中值最小的任意一个。如果没有元素存在，返回一个空字符串""。
 *
 * 挑战：以 O(1) 的时间复杂度实现所有操作。
 */
public class AllOne {
    private Map<String,Integer> map;
    private List<Set<String>> list;

    public AllOne() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public void inc(String key) {
        int i;
        if (map.containsKey(key)){
            i = map.get(key);
            list.get(i).remove(key);
            i++;
        }else i=0;
        while (list.size()<=i) list.add(new HashSet<>());
        list.get(i).add(key);
        map.put(key,i);
    }

    public void dec(String key) {
        if (!map.containsKey(key)) return;
        Integer i = map.get(key);
        list.get(i--).remove(key);
        if (i<0){
            map.remove(key);
        }else {
            list.get(i).add(key);
            map.put(key,i);
        }
    }

    public String getMaxKey() {
        for (int i = list.size() - 1; i >= 0; i--) {
            Set<String> set = list.get(i);
            if (set.isEmpty()) continue;
            return set.iterator().next();
        }
        return "";
    }

    public String getMinKey() {
        for (Set<String> set : list) {
            if (set.isEmpty()) continue;
            return set.iterator().next();
        }
        return "";
    }
}