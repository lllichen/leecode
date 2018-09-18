package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.TreeNode;

import java.util.Calendar;

/**
 * Created by lichen@daojia.com on 2018-9-17.
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 *
 *    3
     / \
    9  20
      /  \
     15   7
 *
 */
public class BuildTree {


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0){
            return null;
        }
        for (int i = 0 ; i < preorder.length; i++){
            TreeNode root = new TreeNode(preorder[i]);
            for (int j = 0 ; j < inorder.length; j++){

            }
        }

        return null;
    }


}
