package ink.lichen.leecode.test.test_old.test_3_11;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-3-11.
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
