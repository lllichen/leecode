package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-11-27.
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 *        _______3______
 *        /              \
 *     ___5__          ___1__
 *    /      \        /      \
 *    6      _2       0       8
 *          /  \
 *          7   4
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 */
public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        if (left != null && left != p && left != q)
            return left;
        TreeNode right = lowestCommonAncestor(root.right, p , q);
        if (left != null && right != null)
            return root;
        return left != null ? left : right;
    }
}
