package ink.lichen.leecode.test.test_1_23;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2019-1-23.
 */
public class ReverseList {


    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }



}
