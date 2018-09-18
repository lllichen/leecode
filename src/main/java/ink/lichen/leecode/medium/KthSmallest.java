package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.TreeNode;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-9-18.
 *
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素
 *
 * 输入: root = [3,1,4,null,2], k = 1
       3
      / \
     1   4
     \
      2
   输出: 1
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
        5
       / \
      3   6
     / \
    2   4
   /
 1
   输出: 3
 *
 *
 * 如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化 kthSmallest 函数？
 */

public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        int i = 0;

        while (root != null || !stack.isEmpty())
        {
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty())
            {
                TreeNode node = stack.pop();
                i++;
                node = node.right;
            }
        }


        return 0;
    }
}
