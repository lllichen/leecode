package ink.lichen.leecode.tree.bst;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 *
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和 插入的值: 5
 *
 *           4
 *        /   \
 *       2     7
 *      / \   /
 *     1   3 5
 *
 */
public class InsertIntoBST {


    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null){
            return new TreeNode(val);
        }

        if (val < root.val){
            root.left = insertIntoBST(root.left,val);
        }else {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}
