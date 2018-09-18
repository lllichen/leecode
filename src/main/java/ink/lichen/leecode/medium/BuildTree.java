package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.TreeNode;

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

        int preStart = 0;
        int inStart = 0;
        int inEnd = preorder.length;
        return help(preStart,inStart,inEnd,preorder,inorder);
    }

    private TreeNode help(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder ){
        int index = 0;
        TreeNode root = new TreeNode(preorder[preStart]);
//        if ( preStart > index || inStart > inEnd ){
//            return null;
//        }

        for ( int i = inStart; i < inEnd; i++ ){
            if (inorder[i] == root.val){
                index = i;
                break;
            }
        }
        root.left = help(preStart+1,inStart,index,preorder,inorder);
        root.right = help(preStart+index - inStart+1,index+1,inEnd,preorder,inorder);
        return root;
    }


}
