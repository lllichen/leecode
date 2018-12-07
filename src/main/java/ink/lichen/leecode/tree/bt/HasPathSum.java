package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 *
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if (root.val==sum&&root.left==null&&root.right==null){
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }
}
