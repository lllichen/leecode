package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-27.
 * A:          a1 → a2                        a1>a2>c1>c2>c3>b1>b2>b3>c1>c2>c3
 *                    ↘                      b1>b2>b3>c1>c2>c3>a1>a2>c1>c2>c3
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 *
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 *
 */
public class GetIntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        boolean changeA = true;
        boolean changeB = true;
        while (dummyA != null || dummyB != null){
            if (changeA && dummyA ==null ){
                dummyA= headB;
                changeA = false;
            }
            if (changeB && dummyB == null){
                dummyB = headA;
                changeB = false;
            }
            if (dummyA == dummyB){
                return dummyA;
            }
            dummyA =dummyA.next;
            dummyB = dummyB.next;
        }
        return null;
    }
}
