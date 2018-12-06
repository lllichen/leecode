package ink.lichen.leecode.tree.bt;

import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-12-6.
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null){
            return list;
        }
        list.add(root.val);
        if (root.left != null){
            list.addAll(preorderTraversal(root.left));
        }
        if (root.right != null){
            list.addAll(preorderTraversal(root.right));
        }
        return list;

    }
}
