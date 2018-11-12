package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

public class ReverseList {

    //recursion
//    public ListNode reverseList(ListNode head) {
//       if (head == null || head.next == null){
//           return head;
//       }
//       ListNode second = head.next;
//       head.next = null;
//       ListNode newHead = reverseList(second);
//       second.next = head;
//        return newHead;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
