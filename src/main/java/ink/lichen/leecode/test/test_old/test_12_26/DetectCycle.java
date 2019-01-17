package ink.lichen.leecode.test.test_old.test_12_26;

import ink.lichen.leecode.support.ListNode;

public class DetectCycle {

    //a+x = a+x+y+x
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode cur = head;
                while (cur != slow){
                    cur = cur.next;
                    slow = slow.next;
                }
                return cur;
            }
        }
        return null;

    }
}
