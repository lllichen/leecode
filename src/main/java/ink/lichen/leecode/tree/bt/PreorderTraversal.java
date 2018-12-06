package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        if (root == null){
//            return list;
//        }
//        list.add(root.val);
//        if (root.left != null){
//            list.addAll(preorderTraversal(root.left));
//        }
//        if (root.right != null){
//            list.addAll(preorderTraversal(root.right));
//        }
//        return list;

        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            p = stack.pop();
            list.add(p.val);
            if (p.right != null) stack.push(p.right);
            if (p.left != null) stack.push(p.left);

        }
        return list;
    }

}
