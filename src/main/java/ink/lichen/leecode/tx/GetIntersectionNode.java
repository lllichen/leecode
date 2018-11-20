package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-20.
 *
 * 例如，下面的两个链表：
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * 在节点 c1 开始相交。
 *
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 *
 *
 */
public class GetIntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        if(headA==headB){
            return headA;
        }
        int num1=0;
        int num2=0;
        int count = 0;
        ListNode temp3 = headA;
        ListNode temp4 = headB;
        for(ListNode temp = headA;temp!=null;temp=temp.next){
            num1++;
        }
        for(ListNode temp = headB;temp!=null;temp=temp.next){
            num2++;
        }
        if(num1>num2){
            count = num1-num2;
            while(count!=0){
                temp3 = temp3.next;
                count--;
            }
        }else{
            count = num2-num1;
            while(count!=0){
                temp4=temp4.next;
                count--;
            }
        }
        while((temp3!=null)&&(temp4!=null)){
            if(temp3==temp4){
                return temp3;
            }
            temp3=temp3.next;
            temp4=temp4.next;
        }
        return null;
    }
}
