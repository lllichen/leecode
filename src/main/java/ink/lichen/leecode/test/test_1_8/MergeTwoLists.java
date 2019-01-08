package ink.lichen.leecode.test.test_1_8;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2019-1-8.
 */
public class MergeTwoLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
