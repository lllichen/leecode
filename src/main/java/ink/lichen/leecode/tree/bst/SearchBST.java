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
        if (root == null){
            return null;
        }
        int rootVal = root.val;
        TreeNode res = null;
        if (val < rootVal){
             TreeNode treeNode = searchBST(root.left,val);
             if (treeNode != null){
                res = treeNode;
             }
        }else if (val > rootVal){
            TreeNode treeNode = searchBST(root.right,val);
            if (treeNode != null){
                res = treeNode;
            }
        }else {
            return root;
        }
        return res;
    }
}
