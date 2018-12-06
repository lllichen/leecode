package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class LevelOrder {

//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null){
//            return res;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            List<Integer> list = new ArrayList<>();
//            while (size>0){
//                TreeNode node = queue.poll();
//                list.add(node.val);
//                if (node.left != null){
//                    queue.add(node.left);
//                }
//                if (node.right != null ){
//                    queue.add(node.right);
//                }
//                size--;
//            }
//            res.add(list);
//        }
//        return res;
//    }

    //递归实现
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)  return res;
        recursionLevelOrder(root,0,res);
        return res;
    }
    private void recursionLevelOrder(TreeNode root,int level,List<List<Integer>> res){
        if(root==null) return;
        if(res.size()==level){
            List<Integer> subres=new ArrayList<>();
            subres.add(root.val);
            res.add(subres);
        }else{
            res.get(level).add(root.val);
        }
        recursionLevelOrder(root.left,level+1,res);
        recursionLevelOrder(root.right,level+1,res);
    }
}
