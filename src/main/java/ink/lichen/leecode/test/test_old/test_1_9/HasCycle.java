package ink.lichen.leecode.test.test_old.test_1_9;

import ink.lichen.leecode.support.ListNode;

public class HasCycle {


    public boolean hasCycle(ListNode head) {
        ListNode fast = head,slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
}
