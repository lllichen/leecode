package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cur = 0;
        ListNode dummy = new ListNode(0);
        ListNode curNode = dummy;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null && l2 != null) {
                int val1 = l1.val;
                int val2 = l2.val;
                sum = val1 + val2 + cur;
                l1 = l1.next;
                l2 = l2.next;

            }else if (l1 != null) {
                int val1 = l1.val;
                sum = val1 + cur;
                l1 = l1.next;
            }else if (l2 != null){
                int val2 = l2.val;
                sum = val2 + cur;
                l2 = l2.next;
            }
            if (sum >= 10) {
                curNode.next = new ListNode(sum - 10);
                cur = 1;
            } else {
                curNode.next = new ListNode(sum);
                cur = 0;
            }
            curNode = curNode.next;
        }
        if (cur == 1){
            curNode.next = new ListNode(1);
        }
        return dummy.next;
    }
}
