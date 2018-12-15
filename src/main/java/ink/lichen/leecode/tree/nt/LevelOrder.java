package ink.lichen.leecode.tree.nt;

import ink.lichen.leecode.support.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-15.
 */
public class LevelOrder {


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size  = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size > 0){
                Node pollNode = queue.poll();
                temp.add(pollNode.val);
                for (Node child : pollNode.children){
                    queue.add(child);
                }
                size--;
            }
        }

        return res;
    }

//    public void help(Node root, List<List<Integer>> res){
//        if (root != null){
//
//        }
//    }
}
