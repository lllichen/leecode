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

        boolean isEmpty(){
            return set.isEmpty();
        }
    }

    Node max;
    Node min;


    Map<String,Integer> map;

    Map<Integer,Node> nodeMap;


    /**
     * Initialize your data structure here.
     */
    public AllOne() {
        map = new HashMap<>();
        nodeMap = new HashMap<Integer,Node>();
        min = new Node(null,null);
        max = new Node(min,null);
        min.next = max;
    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        Integer val = map.get(key) ;
        if (val != null){
            Integer oldVal = val;
            Node oldNode = nodeMap.get(oldVal);
            oldNode.remove(key);
            if (oldNode.isEmpty()){
                oldNode.pre.next = oldNode.next;
                oldNode.next.pre = oldNode.pre;
                oldNode = oldNode.pre;
            }

            Integer newVal = val+1;
            map.put(key,val+1);
            Node newNode = nodeMap.get(newVal);
            if (newNode == null) {
                newNode = new Node(oldNode, oldNode.next);
                //mark
                oldNode.next.pre = oldNode.next = newNode;

                nodeMap.put(newVal, newNode);
            }
                newNode.add(key);

        }else {
            map.put(key,1);
            Node node = nodeMap.get(1);
            if (node == null){
                node = new Node(min,min.next);
                min.next.pre = min.next = node;
                node.add(key);
                nodeMap.put(1,node);
            }else {
                node.add(key);
            }
        }
    }


    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        Integer val = map.get(key);
        if (val == null){
            return;
        }
        if (val == 1){
            map.remove(key);
            Node old = min.next;
            old.remove(key);
            if (old.isEmpty()){
                nodeMap.remove(1);
                min.next = old.next;
                old.next.pre = min;
            }
        }else {
            Node old = nodeMap.get(val);
            old.remove(key);
            if (old.isEmpty()){
                old.pre.next = old.next;
                old.next.pre = old.pre;
                old = old.next;
            }
            val = val-1;
            map.put(key,val);
            Node newNode = nodeMap.get(val);
            //check isEmpty
            if (newNode.isEmpty()){
                newNode = new Node(old.pre,old);
                old.pre.next = old.pre = newNode;
            }
            newNode.add(key);
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        Node node = max.pre;
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

        Node node = min.next;
        if (node == max){
            return "";
        }else {
            return node.val();
        }
    }


//    ["AllOne","inc","inc","inc","dec","inc","inc","getMaxKey","dec","dec","dec","getMaxKey"]
//            [[],["hello"],["world"],["hello"],["world"],["hello"],["leet"],[],["hello"],["hello"],["hello"],[]]

    public static void main(String[] args) {
        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("world");
        allOne.inc("hello");
        allOne.dec("world");
        allOne.inc("hello");
        allOne.inc("leet");
        System.out.println(allOne.getMaxKey());
        allOne.dec("hello");
        allOne.dec("hello");
        allOne.dec("hello");
        System.out.println(allOne.getMaxKey());
    }
}
