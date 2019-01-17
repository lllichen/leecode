package ink.lichen.leecode.test.test_old.test_12_26;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-12-26.
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int cu = 0;
        while (l1 != null || l2 != null){
            int val_1 = l1 != null ? l1.val:0;
            int val_2 = l2 != null ? l2.val:0;
            int sum = val_1+val_2 + cu;
            if (sum >= 10){
                cu = 1;
                sum = sum - 10;
            }else{
                cu = 0;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            l1 = l1 != null ? l1.next:null;
            l2 = l2 != null ? l2.next:null;
        }
        cur.next = cu != 0 ? new ListNode(1): null;
        return res.next;
    }
}
