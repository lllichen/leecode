package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.Arrays;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class BuildTree {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = null;
        for (int i = postorder.length-1 ; i >=0; i--){
            int v = postorder[i];
            for (int z : inorder){
                if (z == v){
                    root = new TreeNode(postorder[i]);
                    break;
                }
            }
            if (root != null){
                break;
            }
        }
        if (root == null){
            return null;
        }

        int val = root.val;
        for (int i = 0; i < inorder.length; i++){
            if (val == inorder[i]){
                root.left = buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,postorder.length-1));
                root.right = buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,0,postorder.length-1));
            }
        }
        return root;
    }

    public TreeNode buildTreeHelp(int[] inorder, int[] postorder){
        return null;
    }

    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        buildTree.buildTree(new int[]{1,2,3,4},new int[]{2,1,4,3});
    }

}
