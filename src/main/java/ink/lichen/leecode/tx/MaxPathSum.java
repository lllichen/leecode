package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 *
 * 输入: [1,2,3]
 *
 *        1
 *       / \
 *      2   3
 *
 * 输出: 6
 *
 */
public class MaxPathSum {

    private int max;

    private int cur;

    public int maxPathSum(TreeNode root) {
        if (root == null)return 0;
        if (root.left != null) {
            return maxPathSum(root.left);
        }

        return 0;
    }
}
