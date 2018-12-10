package ink.lichen.leecode.tree.bst;

import ink.lichen.leecode.support.TreeNode;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class IsValidBST {


    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        Integer preVal = null;
        if (p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                p = p.left;
            }else {
                p = stack.pop();
                int val = p.val;
                if (preVal == null){
                    preVal = val;
                }else {
                    if (val <= preVal){
                        return false;
                    }
                    preVal = val;
                }
                p = p.right;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);
        IsValidBST isValidBST = new IsValidBST();
        System.out.println( isValidBST.isValidBST(node));
    }


}
