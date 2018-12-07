package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class MaxDepth {


    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left)+1;
        int rightDepth = maxDepth(root.right)+1;
        return Math.max(leftDepth,rightDepth);
    }
}
