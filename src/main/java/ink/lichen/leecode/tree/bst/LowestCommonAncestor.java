package ink.lichen.leecode.tree.bst;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 */
public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        if (p.val > root.val && q.val > root.val ){
            return lowestCommonAncestor(root.right,p,q);
        }else if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return root;
        }
    }
}
