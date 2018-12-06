package ink.lichen.leecode.tree.bst;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class IsValidBST {


    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
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
