package ink.lichen.leecode.test.test_12_29;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length == 0) return null;
        int left = 0, right = lists.length-1;
        return mergeKLists(lists,left,right);
    }

    private ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left < right)
        {
            int center = (left + right)>>1;
            ListNode l1 = mergeKLists(lists,left,center);
            ListNode l2 = mergeKLists(lists,center+1,right);
            return merge(l1,l2);

        } else {
            return lists[left];
        }
    }



    private ListNode  merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1:l2;
        return dummy.next;
    }

}
