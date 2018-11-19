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
 */
public class MaxPathSum {

    private int max;

    private int cur;

    public int maxPathSum(TreeNode root) {
        if (root == null)return 0;
        max = root.val;
        cur = 0;
        help(root);
        return max;
    }

    public void help(TreeNode root){
        if (root == null)return;
        if (root.left != null) {
            help(root.left);
        }
        cur += root.val;
        if (cur > max)
            max = cur;
        if (cur < 0)
            cur = 0;
        if (root.right != null) {
            help(root.right);
            if (root.val < 0)
                cur = cur + root.val;
        }

    }


    public static void main(String[] args) {
//        [1,-2,-3,1,3,-2,null,-1]
//        [5,4,8,11,null,13,4,7,2,null,null,null,1]
//        7
//        18
//        20
//        24
//        29
//        42
//        50
//        54
//        55

//        48

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(-1);

        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(-1);


        MaxPathSum maxPathSum = new MaxPathSum();
        System.out.println(maxPathSum.maxPathSum(root));
    }
}
