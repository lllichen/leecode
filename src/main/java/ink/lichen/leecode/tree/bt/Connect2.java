package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeLinkNode;

/**
 *      1
 *    /  \
 *   2    3
 *  / \    \
 * 4   5    7
 *
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \    \
 * 4-> 5 -> 7 -> NULL
 */
public class Connect2 {

    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode tem = root;
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            }
            while (tem.next != null && root.left.next == null) {
                tem = tem.next;
                if (tem.left != null) {
                    root.left.next = tem.left;
                } else if (tem.right != null) {
                    root.left.next = tem.right;
                }
            }
        }
        if (root.right != null) {
            while (tem.next != null && root.right.next == null) {
                tem = tem.next;
                if (tem.left != null) {
                    root.right.next = tem.left;
                } else if (tem.right != null) {
                    root.right.next = tem.right;
                }
            }
        }
        connect(root.right);
        connect(root.left);
    }
}
