package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class PostorderTraversal {

//    public void help(TreeNode node, List<Integer> list){
//        if (node != null){
//            help(node.left,list);
//            help(node.right,list);
//            list.add(node.val);
//        }
//    }
//
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        help(root,list);
//        return list;
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> main = new Stack<>();
        main.push(root);
        TreeNode temp = null;
        while (!main.isEmpty()){
            temp = main.pop();
            ((LinkedList<Integer>) list).addFirst(temp.val);
            if (temp.left != null){
                main.push(temp.left);
            }
            if (temp.right != null){
                main.push(temp.right);
            }
        }
        return list;
    }
}
