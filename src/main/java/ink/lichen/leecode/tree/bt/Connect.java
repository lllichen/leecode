package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeLinkNode;

public class Connect {


    public void connect(TreeLinkNode root) {
        if (root == null || root.left == null || root.right == null){
            return;
        }
        root.left.next = root.right;
        if (root.next != null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }
}
