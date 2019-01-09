package ink.lichen.leecode.test.test_1_9;

import ink.lichen.leecode.support.ListNode;

public class MergeKLists {


    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if ( n < 1){
            return null;
        }
        int left = 0;
        int right = n-1;
        ListNode listNode = mergeKLists(lists,left,right);
        return listNode;

    }

    public ListNode mergeKLists(ListNode[] lists ,int left, int right){
        if (left < right){
            int center = (left + right) >> 1;
            ListNode listNode1 = mergeKLists(lists,left,center);
            ListNode listNode2 = mergeKLists(lists,center+1,right);
            return merge(listNode1,listNode2);
        }else {
            return lists[right];
        }
    }

    private ListNode merge(ListNode l1, ListNode l2) {
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

        cur.next = l1 != null ? l1 : l2;
        return dummy.next;
    }
}
