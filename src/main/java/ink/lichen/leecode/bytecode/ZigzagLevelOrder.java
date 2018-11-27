package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;
import ink.lichen.leecode.support.TreeNode;

import java.util.*;

/**
 * Created by lichen@daojia.com on 2018-11-27.
 *
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *   [
 *   [3],
 *   [20,9],
 *   [15,7]
 *   ]
 */
public class ZigzagLevelOrder {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0 ; i < size; i++){
                TreeNode node = queue.poll();
                if (flag){
                    list.add(node.val);
                }else {
                    list.add(0,node.val);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(list);
            flag = !flag;
        }
        return res;
    }
}
