package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 */
public class MaxDepth {


    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left)+1;
        int rightDepth = maxDepth(root.right) +1;
        return leftDepth > rightDepth ? leftDepth:rightDepth;

    }
}
