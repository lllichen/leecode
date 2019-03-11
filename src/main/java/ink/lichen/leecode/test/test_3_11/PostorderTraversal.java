package ink.lichen.leecode.test.test_3_11;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2019-3-11.
 */
public class PostorderTraversal {

//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        help(result,root);
//        return result;
//    }
//
//    private void help(List<Integer> result,TreeNode root){
//        if (root != null){
//            help(result,root.left);
//            help(result,root.right);
//            result.add(root.val);
//        }
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.addFirst(node.val);
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right != null){
                stack.push(node.right);
            }
        }
        return result;
    }
}
