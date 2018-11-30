package ink.lichen.leecode.bytecode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-11-29.
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，
 * 它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 *
 */
public class LRUCache {

    private static class ListNode{

        private int val;

        private int key;

        ListNode(int key, int val){
            this.key = key;
            this.val = val;
            pre = null;
            next = null;
        }

        private ListNode pre;
        private ListNode next;
    }


    private ListNode head;

    private  ListNode tail;

    private int capacity;

    private Map<Integer,ListNode> map;

    private ListNode empty = new ListNode(-1,-1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.pre = head;
        map = new HashMap<>();
    }

    private void addHeader(ListNode node){
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;

    }
    public int get(int key) {
        ListNode res = map.getOrDefault(key,empty);
        if (res != empty){
            addHeader(res);
        }
        return res.val;
    }



    public void put(int key, int value) {
        ListNode node = map.getOrDefault(key,empty);
        ListNode newNode = new ListNode(key,value);
        if (node != empty ){
            deleteNode(node);
            addHeader(node);
            map.put(key,node);
        }else {
            if (map.size() < capacity){
                addHeader(newNode);
                map.put(key,newNode);
            }else {
                ListNode tailNode = tail.pre;
                deleteNode(tailNode);
                map.remove(tailNode.key);

                addHeader(newNode);
                map.put(key,newNode);
            }
        }

    }

    private void deleteNode(ListNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
}
