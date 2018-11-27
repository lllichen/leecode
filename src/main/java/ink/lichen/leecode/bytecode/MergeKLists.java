package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-27.
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 */
public class MergeKLists {


    public ListNode mergeKLists(ListNode[] lists) {
        int left = 0,right = lists.length-1;
//        while (le)

        return null;
    }

    public ListNode merge(ListNode[] lists,int left,int right){
        if (left < right){
            int center = (left+right)>>1;
            ListNode leftNode =  merge(lists,left,center);
            ListNode rightNode = merge(lists,center+1,right);


        }
        return null;
    }

}
