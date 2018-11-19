package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.TreeNode;


public class KthSmallest {

    int kth;
    int count;
    int k;

    private void traverse(TreeNode root) {
        if (count >= k) return;
        if (root.left != null) traverse(root.left);
        count ++;
        if (count == k) {
            kth = root.val;
            return;
        }
        if (root.right != null) traverse(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        traverse(root);
        return kth;
    }

}
