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

    private TreeNode root;

    public int maxPathSum(TreeNode root) {
        if (root == null)return 0;
        max = root.val;

        this.root = root;
        help(root);
        return max;
    }

    public int help(TreeNode root){
        if (root == null)return 0;

        int leftVal = help(root.left)+root.val;
        int rightVal = help(root.right)+root.val;
        int maxVal = leftVal > rightVal ? leftVal:rightVal;
        System.out.println(maxVal);

        int all = leftVal+rightVal-root.val;
        if (max < all){
            max = all;
        }
        if (max < maxVal)
            max = maxVal;

        return maxVal < 0 ? 0 : maxVal;
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

//                TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right= new TreeNode(3);

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
