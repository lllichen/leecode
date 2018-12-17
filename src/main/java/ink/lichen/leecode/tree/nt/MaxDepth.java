package ink.lichen.leecode.tree.nt;

import ink.lichen.leecode.support.Node;

/**
 * Created by lichen@daojia.com on 2018-12-15.
 */
public class MaxDepth {


    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        else
        {
            int depth = 0;
            for(int i = 0;i<root.children.size();i++)
            {
                depth = Math.max(depth,maxDepth(root.children.get(i)));
            }
            return depth+1;
        }
    }


//    private int max = 0;
//
//    public int maxDepth(Node root) {
//
//        if (root == null){
//            return max;
//        }
//        help(root,0);
//        return max;
//    }
//
//    public void help(Node root,int height){
//        if (root == null){
//            return;
//        }
//        height++;
//        if (max < height){
//            max = height;
//        }
//        for (Node child  : root.children ){
//            help(child,height);
//        }
//    }

}
