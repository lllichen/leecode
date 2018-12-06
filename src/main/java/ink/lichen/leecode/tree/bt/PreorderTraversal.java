package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class PreorderTraversal {


//    public void help(TreeNode node, List<Integer> list){
//        if (node != null) {
//            list.add(node.val);
//            help(node.left, list);
//            help(node.right, list);
//        }
//    }
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        if (root == null) {
//            return list;
//        }
//        help(root, list);
//        return list;
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        TreeNode p = null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            p = stack.pop();
            list.add(p.val);
            if (p.right != null)
                stack.push(p.right);
            if (p.left != null)
                stack.push(p.left);
        }
        return list;
    }



}
