package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.ListNode;
import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-9-17.
 */
public class ZigzagLevelOrder {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();

        TreeNode dummy = new TreeNode(Integer.MIN_VALUE);

        if (root == null) {
            return res;
        }

        queue.add(root);
        queue.add(dummy);
        int i = 1;

        List<Integer>  odd = new ArrayList<>();
        LinkedList<Integer>  even = new LinkedList<>();
        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();
            System.out.println(temp.val);
            if (temp == dummy){
                if (i %2 == 0){
                    res.add(even);
                    even = new LinkedList();
                }else {
                    res.add(odd);
                    odd = new ArrayList();
                }
                i++;
                if (queue.size() > 0){
                    queue.add(dummy);
                    continue;
                }else {
                    break;
                }

            }

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            if (i % 2 == 0){
                even.addFirst(temp.val);
//                System.out.println("even: "+temp.val);
            }else {
                odd.add(temp.val);
            }
        }
        return res;
    }
}
