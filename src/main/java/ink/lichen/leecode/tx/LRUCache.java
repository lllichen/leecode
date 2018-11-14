package ink.lichen.leecode.tx;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class Node {
    int key;
    int value;
    Node pre;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {

    Map<Integer,Node> map ;
    Node head ;
    Node tail ;
    Node empty;

    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        empty = new Node(0,-1);
    }

    public int get(int key) {
        Node val = map.getOrDefault(key,empty);
        if (val.value != -1){
            val.next.pre = val.pre;
            val.pre.next = val.next;
            val.next = head.next.next;
            head.next = val;
            val.pre = head;
        }
        return val.value;
    }

    public void put(int key, int value) {
        Node val = map.getOrDefault(key,empty);
        if (val != empty){

        }
    }
}
