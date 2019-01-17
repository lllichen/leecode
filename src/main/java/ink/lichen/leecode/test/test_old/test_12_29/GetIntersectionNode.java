package ink.lichen.leecode.test.test_old.test_12_29;

import ink.lichen.leecode.support.ListNode;

public class GetIntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA,pB = headB;
        while ( pA != pB){
            pA = pA == null? headB : pA.next;
            pB = pB == null? headA : pA.next;
        }
        return pA;
    }
}
