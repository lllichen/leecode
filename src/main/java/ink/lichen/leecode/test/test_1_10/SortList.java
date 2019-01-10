package ink.lichen.leecode.test.test_1_10;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2019-1-10.
 *  4->2->1->3
 */
public class SortList {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode fast = head,slow = head,pre = null;
        while (fast != null && fast.next != null){
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        pre.next = null;
        return merge(sortList(head),sortList(slow));
    }

    public ListNode merge(ListNode lt, ListNode rt){
        ListNode dummy = new ListNode(-1);
        while (lt != null && rt != null){

        }
    }
}
