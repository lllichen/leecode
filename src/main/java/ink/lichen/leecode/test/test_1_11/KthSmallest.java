package ink.lichen.leecode.test.test_1_11;

import ink.lichen.leecode.support.TreeNode;

/**
 * Created by lichen@daojia.com on 2019-1-11.
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 1
 *
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 *
 *
 */
public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        help(root,k);
        return 0;
    }

    private int t = 0;
    private int val = 0;

    private void  help(TreeNode node,int k){
        if (node != null){
            help(node.left,k);
            t = t+1;
            if (t == k){
                val = node.val;
                return;
            }
            System.out.println(node.val);
            help(node.right,k);
        }
    }



}
