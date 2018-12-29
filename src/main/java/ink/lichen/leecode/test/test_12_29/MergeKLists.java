package ink.lichen.leecode.test.test_12_29;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int left = 0, right = lists.length-1;
        mergeKLists(lists,left,right);
        return null;
    }

    private void mergeKLists(ListNode[] lists, int left, int right) {
        if (left < right){
            int center = (left + right)>>1;
            mergeKLists(lists,left,center);
            mergeKLists(lists,center+1,right);
//            merge(lists,)
        }
    }
}
