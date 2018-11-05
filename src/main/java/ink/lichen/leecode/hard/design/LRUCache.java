package ink.lichen.leecode.hard.design;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LRUCache {

    Stack<Integer> stack ;
    Map<Integer, Integer> map ;
    int capacity;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        stack = new Stack<>();
    }

    public int get(int key) {
       return map.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        if (stack.size() == capacity){
            map.remove(stack.pop());
        }
        stack.push(key);
        map.put(key,value);
    }

}
