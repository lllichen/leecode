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
//        Set<ListNode> set = new HashSet<>();
//        while (headA != null){
//            set.add(headA);
//            headA = headA.next;
//        }
//        while (headB != null){
//            if (set.contains(headB)){
//                return headB;
//            }else{
//                headB = headB.next;
//            }
//        }
        if(headA == null || headB == null){
            return null;
        }
        ListNode dummyA = headA;
        ListNode dummyB = headB;

        while (headA != null || headB != null || dummyA != null || dummyB != null ){
            ListNode temp;
            ListNode tempb;
            if (headA != null){
                temp = headA;
                headA = headA.next;
            }else {
                temp = headB;
                headB = headB.next;
            }

            if (dummyB != null){
                tempb = dummyB;
                dummyB = dummyB.next;
            }else {
                tempb = dummyA;
                dummyA = dummyA.next;
            }

            if(temp == tempb){
                return temp;
            }
        }
        return null;
    }

}
