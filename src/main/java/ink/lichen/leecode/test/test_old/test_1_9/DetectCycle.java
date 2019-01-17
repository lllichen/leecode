package ink.lichen.leecode.test.test_old.test_1_9;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2019-1-9.
 */
public class DetectCycle {


    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                fast = head;
                while (fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
