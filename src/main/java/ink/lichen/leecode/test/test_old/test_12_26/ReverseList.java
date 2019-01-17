package ink.lichen.leecode.test.test_old.test_12_26;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-12-26.
 */
public class ReverseList {

//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        while (head != null){
//            ListNode next = head.next;
//            head.next = pre;
//            pre = head;
//            head = next;
//        }
//        return pre;
//    }

    public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null){
                return head;
            }
            ListNode h = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return h;
    }
}
