package ink.lichen.leecode.test.test_12_29;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
 *
 * 当遍历到一个root点的时候，
 * 1.判断root是不是null如果root为null，那么就无所谓祖先节点，直接返回null就好了
 * 2.如果root的左子树存在p，右子树存在q，那么root肯定就是最近祖先
 * 3.如果pq都在root的左子树，那么就需要递归root的左子树，右子树同理
 * ---------------------
 *
 *   //DFS:
 *     在root为根的二叉树中找A,B的LCA:
 *     如果找到了就返回这个LCA
 *     如果只碰到A，就返回A
 *     如果只碰到B，就返回B
 *     如果都没有，就返回null
 *
 */
public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        //Divide:
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        //Conquer:
        if (left != null && right != null){
            return root;
        }
        if (left != null){
            return left;
        }
        if (right != null){
            return right;
        }

        return null;
    }
}
