package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-20.
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        if(head==null||head.next==null){
            return false;
        }

        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) return true;
        }

        return false;
    }
}
