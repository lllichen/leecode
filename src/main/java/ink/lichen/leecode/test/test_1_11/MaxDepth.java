package ink.lichen.leecode.test.test_1_11;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-1-11.
 */
public class MaxDepth {


    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max( maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
