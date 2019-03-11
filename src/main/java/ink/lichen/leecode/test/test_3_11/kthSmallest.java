package ink.lichen.leecode.test.test_3_11;

import ink.lichen.leecode.support.TreeNode;

import java.util.List;

/**
 * Created by lichen@daojia.com on 2019-3-11.
 */
public class kthSmallest {


    public int kthSmallest(TreeNode root, int k) {
        int i = 0;
        help(root, i,k);
        return val;
    }

    int val;

    private void help(TreeNode root, int i,int k){
        if (root != null){
            help(root.left,i,k);
            i++;
            if (i == k){
                val = root.val;
                return;
            }
            help(root.right,i,k);
        }
    }


}
