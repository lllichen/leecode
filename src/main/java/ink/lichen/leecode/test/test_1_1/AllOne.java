package ink.lichen.leecode.test.test_1_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllOne {

//    1,2,3,4,5,6,7,8,9,10

    private static class Node{

        Set<String> set = new HashSet<>();

        public Node(Node pre, Node next) {
            this.pre = pre;
            this.next = next;
        }

        Node pre;

        Node next;

        void add(String val){
            set.add(val);
        }

        void remove(String val){
            set.remove(val);
        }

        String val(){
            return set.iterator().next();
        }
    }

    Node max;
    Node min;


    Map<String,Integer> map;


    /**
     * Initialize your data structure here.
     */
    public AllOne() {
        map = new HashMap<>();
        max = new Node(null,null);
        min = new Node(max,null);
        max.next = min;
    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        Integer val = map.get(key) ;
        if (val != null){
            Integer old = val;
            map.put(key,val+1);
        }
    }


    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {

    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        Node node = max.next;
        if (node == min){
            return "";
        }else {
            return node.val();
        }
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {

        Node node = min.pre;
        if (node == max){
            return "";
        }else {
            return node.val();
        }
    }
}
