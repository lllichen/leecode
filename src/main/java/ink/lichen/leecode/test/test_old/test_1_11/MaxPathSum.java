package ink.lichen.leecode.test.test_old.test_1_11;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-1-11.
 * 输入: [1,2,3]
 * <p>
 * 1
 * / \
 * 2   3
 * <p>
 * 输出: 6
 * <p>
 * -10
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 输出: 42
 */
public class MaxPathSum {

    private int max;

    public int maxPathSum(TreeNode root) {
        help(root);
        max = root.val;
        return max;
    }

    private int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftVal = help(root.left) + root.val;
        int rightVal = help(root.right) + root.val;
        int maxVal = leftVal > rightVal ? leftVal : rightVal;
        int all = leftVal + rightVal - root.val;
        if (max < maxVal) {
            max = maxVal;
        }
        if (max < all) {
            max = all;
        }
        return maxVal < 0 ? 0 : maxVal;
    }
}
