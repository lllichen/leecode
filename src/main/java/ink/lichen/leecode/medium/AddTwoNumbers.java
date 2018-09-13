package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-9-13.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode ret = new ListNode(0);
        ListNode zero = new ListNode(0);
        ListNode tmp = ret;
        int val = l1.val + l2.val;
        while (l1.next != null || l2.next != null ){
            if (l1.next == null){
                l1 = zero;
            }else {
                l1 = l1.next;
            }
            if (l2.next == null){
                l2 = zero;
            }else{
                l2 = l2.next;
            }
            System.out.println(val);
            if (val >= 10)
            {
                tmp.next = new ListNode(val -10);
                val = l1.val+l2.val+1;
            }else{
                tmp.next = new ListNode(val);
                val = l1.val+l2.val;
            }
            tmp = tmp.next;
        }
        if (val >= 10){
            tmp.next = new ListNode(val -10);
            tmp.next.next = new ListNode(1);
        }else{
            tmp.next = new ListNode(val);
        }
        return ret.next;
    }
}
