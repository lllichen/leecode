package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

/**
 * a+b + b + c = 2(c+d) => a = c
 *
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null&& fast.next != null){
            if (fast == slow || fast.next == slow){
                break;
            }else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }

        fast = head;
        while (fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
