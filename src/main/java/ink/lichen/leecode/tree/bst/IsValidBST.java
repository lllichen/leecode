package ink.lichen.leecode.tree.bst;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class IsValidBST {


    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return false;
        }
        int val = root.val;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null){
            boolean flag = isValidBST(root.left);
            if (!flag){
                return flag;
            }
        }
        if (right != null){
            boolean flag = isValidBST(root.right);
            if (!flag){
                return flag;
            }
        }

        if (left != null && right != null){
            if (left.val <= val && val  <= right.val ){
                return true;
            }else {
                return false;
            }
        }
        if (left == null && right == null){
            return true;
        }
        if (left == null){
            if (val <= right.val){
                return true;
            }else {
                return false;
            }
        }

        if (right == null){
            if (left.val <= val){
                return true;
            }else {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);
        IsValidBST isValidBST = new IsValidBST();
        isValidBST.isValidBST(node);
    }


}
