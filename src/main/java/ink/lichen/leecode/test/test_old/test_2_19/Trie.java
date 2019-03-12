package ink.lichen.leecode.test.test_old.test_2_19;

import java.util.TreeMap;

/**
 * Created by lichen@daojia.com on 2019-3-7.
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 *
 */
public class Trie {

    private class Node{
        public boolean isWord;    //记录该Node是不是一个字符串的结尾
        public TreeMap<Character, Node> next;  //该Node的下一个Node的Map

        public Node(boolean isWord){
            this.isWord = isWord;
            this.next = new TreeMap<>();
        }
        public Node(){
            this(false);
        }
    }

    private Node root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node cur = root;
        for (int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            //判断当前Node的子节点中是否存在值为c的节点
            if(cur.next.get(c) == null){
                cur.next.put(c, new Node());
            }

            //指针后移
            cur = cur.next.get(c);
        }

        //注意，这里为了防止对重复字符串进行计数，需要做一个if判断
        if(!cur.isWord){
            cur.isWord = true;
        }

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node cur = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(cur.next.get(c)==null){
                return false;
            }

            //指针后移
            cur = cur.next.get(c);
        }

        return cur.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node cur = root;
        for(int i = 0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if(cur.next.get(c) == null){
                return false;
            }

            cur = cur.next.get(c);
        }

        return true;
    }
}
