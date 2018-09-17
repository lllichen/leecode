package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.ListNode;
import ink.lichen.leecode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-9-14.
 *  [1,null,2,3]
 *      1
         \
          2
         /
        3
 *  [1,3,2]
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root.left != null)
        {
            list.addAll(inorderTraversal(root.left));
        }

        list.add(root.val);

        if (root.right != null)
        {
            list.addAll(inorderTraversal(root.right));
        }

        return list;
    }

}
