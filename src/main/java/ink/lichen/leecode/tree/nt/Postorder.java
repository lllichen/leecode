package ink.lichen.leecode.tree.nt;

import ink.lichen.leecode.support.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-15.
 *               1
 *            3  2  4
 *          5  6
 *
 *        返回其后序遍历:[5,6,3,2,4,1]
 *        [1]
 *        [3,2,4]
 *        [5,6]
 */
public class Postorder {


//    public List<Integer> postorder(Node root) {
//        List<Integer> res = new ArrayList<>();
//        help(root,res);
//        return res;
//    }
//
//    public void help(Node root, List<Integer> res){
//        if (root != null){
//            for (Node child : root.children){
//                help(child,res);
//            }
//            res.add(root.val);
//        }
//    }

    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            res.addFirst(node.val);
            for (Node child : node.children){
                stack.push(child);
            }
        }
        return res;
    }
}
