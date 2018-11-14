package ink.lichen.leecode.tx;

import java.util.HashMap;
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
        head.next = tail;
        tail.pre = head;
        empty = new Node(0,-1);
    }

    public void deleteNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(Node node) {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;

//      val.next = head.next;
//      head.next = head.next.pre = val;
//      val.pre = head;
    }


    public int get(int key) {
        Node val = map.getOrDefault(key,empty);
//        System.out.println(val.value);
        if (val != empty){
            deleteNode(val);

            addToHead(val);

        }
        return val.value;
    }

    public void put(int key, int value) {
        Node val = map.get(key);
        Node newVal = new Node(key,value);
        if (val != null){
            deleteNode(val);

            addToHead(newVal);
            map.put(key,newVal);
        }else {

            if (map.size() == capacity){
                map.put(key,newVal);
                addToHead(newVal);

                Node remove = tail.pre;
                deleteNode(remove);
                map.remove(remove.key);
            }else {
                map.put(key,newVal);
                addToHead(newVal);
            }
        }

    }


    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4
    }
}