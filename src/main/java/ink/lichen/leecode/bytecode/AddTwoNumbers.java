package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        cur.next = new ListNode(0);
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;

            sum = sum + cur.next.val;
            cur.next.val = sum % 10;
            cur.next.next = new ListNode(sum / 10);

            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int sum = l1.val + cur.next.val;
            cur.next.val = sum % 10;
            cur.next.next = new ListNode(sum / 10);

            cur = cur.next;
            l1 = l1.next;
        }
        while (l2 != null){
            int sum = l2.val + cur.next.val;
            cur.next.val = sum % 10;
            cur.next.next = new ListNode(sum / 10);

            cur = cur.next;
            l2 = l2.next;
        }
        System.out.println(cur.val);
        if (cur.next.val == 0){
            cur.next = null;
        }
        return dummy.next;
    }


}
