package ink.lichen.leecode.tree.nt;

import ink.lichen.leecode.support.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-15.
 *             1
 *          3  2  4
 *        5  6
 *
 *      返回其前序遍历:[1,3,5,6,2,4]
 */
public class Preorder {


//    public List<Integer> preorder(Node root) {
//        List<Integer> res = new ArrayList<>();
//        help(root,res);
//        return res;
//    }
//
//    public void help(Node root, List<Integer> list){
//        if (root != null){
//            list.add(root.val);
//            for (Node child : root.children){
//                help(child,list);
//            }
//        }
//    }


    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            res.add(node.val);
            List<Node> children = node.children;

            for (int i = children.size()-1;i >=0; i--){
                if (children.get(i) != null){
                    stack.push(children.get(i));
                }
            }
        }
        return res;
    }
}
