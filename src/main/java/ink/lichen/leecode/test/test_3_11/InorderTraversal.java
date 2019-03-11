package ink.lichen.leecode.test.test_3_11;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2019-3-11.
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()){
            if (root != null){
                stack.push(root);
                root = root.left;
            }else {
                 TreeNode left = stack.pop();
                 result.add(left.val);
                 root = left.right;
            }
        }
        return result;

    }

//    输入: [1,null,2,3]
//            1
//            \
//            2
//            /
//            3
//
//    输出: [1,3,2]
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.inorderTraversal(root);
    }
}
