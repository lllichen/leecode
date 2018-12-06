package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 */
public class IsSymmetric {


    public boolean isSymmetric(TreeNode root) {

        return false;
    }

    public boolean help(TreeNode left,TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left != null && right != null && left.val == right.val){
            return true;
        }
        return false;
    }
}
