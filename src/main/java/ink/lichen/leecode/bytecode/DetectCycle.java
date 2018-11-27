package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

/**
 * a+b + b + c = 2(c+d) => a = c
 *
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            while (slow == fast){
                ListNode slow2 = head;
                while (slow != slow2){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return  slow;
            }
        }
        return null;
    }
}


