package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 */
public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cur = 0;
        ListNode dummy = new ListNode(0);
        ListNode curNode = dummy;
        while (l1 != null || l2 != null){
            int val = l1.val;
            l1 = l1.next;
            int val2 = 0;
            if (l2.next != null){
                val2 = l2.val;
                l2 = l2.next;
            }
            if (val+val2+cur >= 10){
                curNode.next = new ListNode(val+val2+cur-10);
                cur = 1;
            }else {
                curNode.next = new ListNode(val+val2+cur);
                cur = 0;
            }
            curNode = curNode.next;
        }
        return dummy.next;
    }
}
