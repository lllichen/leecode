package ink.lichen.leecode.support;

import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-12-15.
 */
public class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
