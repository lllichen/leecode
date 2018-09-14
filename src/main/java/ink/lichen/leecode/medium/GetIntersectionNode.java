package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.ListNode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-9-14.
 *
 *    A:          a1 → a2
 *                       ↘
                         c1 → c2 → c3
                         ↗
      B:     b1 → b2 → b3
 *
 * time o(n)  space o(1)
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (set.contains(headB)){
                return headB;
            }else{
                headB = headB.next;
            }
        }
        return null;
    }

}
