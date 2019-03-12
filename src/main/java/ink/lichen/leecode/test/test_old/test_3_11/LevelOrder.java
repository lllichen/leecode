package ink.lichen.leecode.test.test_old.test_3_11;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lichen@daojia.com on 2019-3-11.
 */
public class LevelOrder {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size > 0){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                size--;
            }
            result.add(temp);
        }
        return result;
    }
}
