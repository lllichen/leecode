package ink.lichen.leecode.test.test_1_11;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-1-11.
 */
public class LowestCommonAncestor2 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q){
            return root;
        }
         TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode = lowestCommonAncestor(root.right,p,q);
        if (leftNode != null && rightNode != null)return root;

        return leftNode != null ? leftNode : rightNode;
    }
}
