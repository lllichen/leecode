package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;
import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-11-27.
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 *        _______3______
 *       /              \
 *     _5__          ___1__
 *    /    \        /      \
 *   6     2       0       8
 *        / \
 *       7  4
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 */
public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            System.out.println("null");
        }else {
            System.out.println(root.val);
        }

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

    public static void main(String[] args) {
//        TreeNode left5 = new TreeNode(5);
//        TreeNode right1 = new TreeNode(1);
//        TreeNode root = new TreeNode(3);
//        root.left = left5;
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(2);
//        root.left.right.left = new TreeNode(7);
//        root.left.right.right = new TreeNode(4);
//
//        root.right = new TreeNode(1);
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);


        TreeNode root = new TreeNode(3);

        TreeNode left5 = new TreeNode(5);
        TreeNode right1 = new TreeNode(1);
        root.left = left5;
        root.right = right1;

        TreeNode left6 = new TreeNode(6);
        TreeNode right2 = new TreeNode(2);
        root.left.left = left6;
        root.left.right = right2;

        TreeNode left7 = new TreeNode(7);
        TreeNode right4 = new TreeNode(4);
        root.left.right.left = left7;
        root.left.right.right = right4;

//        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);


        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        lowestCommonAncestor.lowestCommonAncestor(root,left7,right4);
    }
}
