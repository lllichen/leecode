package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.TreeLinkNode;
import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by lichen@daojia.com on 2018-9-18.
 *
 *     1
     /  \
    2    3
   / \  / \
  4  5 6  7

       1 -> NULL
     /  \
    2 -> 3 -> NULL
   / \  / \
  4->5->6->7 -> NULL
 *
 *
 * 1、你只能使用额外常数空间。
 * 2、使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 * 3、你可以假设它是一个完美二叉树（即所有叶子节点都在同一层，每个父节点都有两个子节点）。
 */
public class Connect {

    public void connect(TreeLinkNode root) {
        if (root == null){
            return;
        }
        Queue<TreeLinkNode> queue = new ArrayDeque<>();
        queue.add(root);
        int size = queue.size();


        while (queue.size() != 0){
            System.out.println(queue.size());
            TreeLinkNode pre = null;
            for (int i = 0 ; i < size; i++)
            {
                TreeLinkNode node = queue.poll();
                if (pre == null){
                    pre = node;
                }else {
                    pre.next = node;
                    pre = pre.next;
                }

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            size = queue.size();
        }

    }
}
