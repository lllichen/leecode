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
        ListNode cur = dummy;
        while (lt != null && rt != null){
            if (lt.val < rt.val){
                cur.next = lt;
                lt = lt.next;
            }else {
                cur.next = rt;
                rt = rt.next;
            }
            cur = cur.next;
        }
        cur.next = lt != null ? lt: rt;
        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println(new SortList().sortList(new ListNode(1)));
    }
}
