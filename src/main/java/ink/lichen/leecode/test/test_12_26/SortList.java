package ink.lichen.leecode.test.test_12_26;

import ink.lichen.leecode.support.ListNode;

public class SortList {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode fast = head,slow = head,pre = null;
        while (fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return merge(sortList(head),sortList(slow));

    }

    private ListNode merge(ListNode fast, ListNode slow) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (fast != null && slow != null){
            if (fast.val < slow.val){
                cur.next = fast;
                fast = fast.next;
            }else{
                cur.next = slow;
                slow = slow.next;
            }
            cur = cur.next;
        }
        cur.next = fast != null ? fast : slow;
        return dummy.next;
    }
}
