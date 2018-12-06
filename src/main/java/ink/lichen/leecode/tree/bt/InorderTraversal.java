package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class InorderTraversal {

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if (root == null){
//            return list;
//        }
//        help(list,root);
//        return list;
//    }
//
//    public void help(List<Integer> list,TreeNode node){
//        if (node != null){
//            help(list,node.left);
//            list.add(node.val);
//            help(list,node.right);
//        }
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = null;
        stack.push(root);
        while (stack.isEmpty()){
            while (stack.peek().left != null){
                stack.push(stack.peek().left);
            }
            p = stack.pop();
            list.add(p.val);
            if (p.right != null){
                
            }
        }
        return list;
    }
}
