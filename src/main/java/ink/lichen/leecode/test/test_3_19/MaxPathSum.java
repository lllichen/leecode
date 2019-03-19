package ink.lichen.leecode.test.test_3_19;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-3-19.
 *
 * 输入: [-10,9,20,null,null,15,7]
 *
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 输出: 42
 *
 *
 */
public class MaxPathSum {

    int maxValue;

    public int maxPathSum(TreeNode root) {
        maxValue = root.val;
        maxPathDown(root);
        return maxValue;
    }
    private int maxPathDown(TreeNode node){
        if(node==null)
            return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(-1);

        System.out.println(new MaxPathSum().maxPathSum(node));
    }
}
