package ink.lichen.leecode.test.test_old.test_12_29;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *  [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 */
public class ZigzagLevelOrder {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();

            while (size >0){
                TreeNode node = queue.poll();
                if (reverse){
                    temp.add(node.val);
                }else {
                    ((LinkedList<Integer>) temp).addFirst(node.val);
                }
                TreeNode left = node.left;
                if (left != null){
                    queue.add(left);
                }
                TreeNode right = node.right;
                if (right != null){
                    queue.add(right);
                }
                size--;

            }
            reverse = !reverse;
            res.add(temp);
        }
        return res;
    }
}
