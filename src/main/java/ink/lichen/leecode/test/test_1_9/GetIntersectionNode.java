package ink.lichen.leecode.test.test_1_9;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2019-1-9.
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        // meet null or same node
        while (curA != curB ){
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }
}
