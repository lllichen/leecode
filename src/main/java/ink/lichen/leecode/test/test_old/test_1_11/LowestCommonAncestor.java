package ink.lichen.leecode.test.test_old.test_1_11;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-1-11.
 */
public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        if (p.val < root.val && q.val < root.val){
                return lowestCommonAncestor(root.left,p,q);
        }else if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return root;
        }
    }
}
