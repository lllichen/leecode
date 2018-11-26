package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

/**
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 */
public class ReverseList {


//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null){
//            return head;
//        }
//
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null){
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//
//        return pre;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

//        return pre;
        return null;
    }
}
