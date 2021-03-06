package ink.lichen.leecode.tree.bst;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和值: 2
 *
 *       2
 *      / \
 *     1   3
 *
 */
public class SearchBST {


    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val){
            return root;
        }
        if (val < root.val){
            return searchBST(root.left,val);
        }else
            return searchBST(root.right,val);
    }
}
